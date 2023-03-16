import kotlin.reflect.*
import kotlin.reflect.full.*
import Case.*

enum class Case {
	NONE,
	UPPERCASE,
	LOWERCASE
}

@Target(AnnotationTarget.PROPERTY, AnnotationTarget.CLASS)
annotation class NoLog

@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY)
annotation class AltName(val name : String, val case: Case = NONE)

object Logger {
	fun log(obj : Any?) {
		if (obj == null) {
			println("null")
		} else {
		
			@Suppress("UNCHECKED_CAST")
			val klass = obj::class as KClass<Any>
			
			val altName = klass.findAnnotation<AltName>()
			val name = altName?.name ?: klass.simpleName
			
			print("${ name }")
			if(klass.hasAnnotation<NoLog>()) {
				println(": objects of this type cannot be logged")
				return
			}
			println(" {")
			klass.memberProperties.forEach { prop ->
				if (prop.visibility == KVisibility.PUBLIC 
					&&  !prop.hasAnnotation<NoLog>()
				   ) {
					val altNameProp = prop.findAnnotation<AltName>()
					var propName = altNameProp?.name ?: prop.name
					if(altNameProp?.case != NONE) {
						propName = if(altNameProp?.case == UPPERCASE) propName.uppercase() else propName.lowercase()
					}
					println("  ${ propName } : ${ prop.get(obj) }")
				}
			}
			println("}")
			
		}
	}
	
}
