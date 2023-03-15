package pt.isel.leic.lae

class ClassWithProperties(number : Int, val txt : String, var flt : Double) {
	val num = number + 1000

	fun mcwp() {
		println("num: ${num} ; txt: ${txt} ; flt: ${flt}")
	}
}

fun inspect(obj : Any) {
	println("--------")

	// Get a KClass object from an instance
	val kcls = obj::class
	println("full  name: " + kcls.qualifiedName)
	println("short name: " + kcls.simpleName)
	
	println("--------")
	println("members: [")
	kcls.members.forEach { 
		println("   " + it)  // show all members of obj's type
		if (it.name == "mcwp") {
			print("      >>>   ")
			it.call(obj)  // invokes method mcwp for the instance referred by obj
		}
	}
	println("]")
}

fun main() {
	println("--------")

	// Get a KClass object from the class
	val kcls = ClassWithProperties::class

	println("full  name: " + kcls.qualifiedName)
	println("short name: " + kcls.simpleName)

	val obj = ClassWithProperties(10, "LAE", 1.2345)

	inspect(obj)
}