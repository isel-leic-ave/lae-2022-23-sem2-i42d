import java.util.NoSuchElementException

fun <T> Sequence<T>.inspect(inspector: (T) -> Unit) : Sequence<T> = sequence {
	for (item in this@inspect) {
		inspector(item)
		yield(item)
	}
}

fun <T> Sequence<T>.where(predicate : (T) -> Boolean) : Sequence<T> = sequence {
	for (item in this@where) {
		if (predicate(item)) {
			yield(item)
		}
	}
}

fun <T,R> Sequence<T>.select(mapper: (T) -> R) : Sequence<R> = sequence {
	for (item in this@select) {
		yield(mapper(item))
	}
}

fun <T> Sequence<T>.lookup(predicate: (T) -> Boolean) : T? {
	for (item in this) {
		if (predicate(item)) {
			return item
		}
	}
	return null
}

data class Person(val id: Int, val name: String, val birthYear: Int)

fun main() {
	val inputData = sequenceOf(
		Person(10000, "Afonso Henriques", 1109),
		Person(14000, "Luís de Camões", 1524),
		Person(11000, "Inês de Castro", 1325),
		Person(12000, "Nuno Álvares Pereira", 1360),
		Person(13000, "Vasco da Gama", 1469),
		Person(16000, "Fernando Pessoa", 1888),
		Person(15000, "Josefa de Óbidos", 1630),
	)

	val outputData1 =
		inputData
			.onEach { println(">> $it") }
			.filter { it.birthYear > 1500 }
			.map    { it.name }
			.find   { it[0] == 'L' }
	
	println(outputData1)
	
	val outputData2 =
		inputData
			.inspect { println(">> $it") }
			.where { it.birthYear > 1500 }
			.select { it.name }
			.lookup { it[0] == 'L' }
	
	println(outputData2)
}
