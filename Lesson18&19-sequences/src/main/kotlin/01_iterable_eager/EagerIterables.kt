package pt.isel.lae.sequences.eager


fun <T> Iterable<T>.inspect(inspector: (T) -> Unit) : Iterable<T> {
	for (item in this) {
		inspector(item)
	}
	return this
}

fun <T> Iterable<T>.where(predicate : (T) -> Boolean) : Iterable<T> {
	val res = mutableListOf<T>()
	for (item in this) {
		if (predicate(item)) {
			res.add(item)
		}
	}
	return res
}

fun <T,R> Iterable<T>.select(mapper: (T) -> R) : Iterable<R> {
	val res = mutableListOf<R>()
	for (item in this) {
		res.add(mapper(item))
	}
	return res
}

fun <T> Iterable<T>.lookup(predicate: (T) -> Boolean) : T? {
	for (item in this) {
		if (predicate(item)) {
			return item
		}
	}
	return null
}

data class Person(val id: Int, val name: String, val birthYear: Int)

fun main() {
	val inputData = listOf(
		Person(10000, "Afonso Henriques", 1109),
		Person(11000, "Inês de Castro", 1325),
		Person(12000, "Nuno Álvares Pereira", 1360),
		Person(13000, "Vasco da Gama", 1469),
		Person(14000, "Luís de Camões", 1524),
		Person(15000, "Josefa de Óbidos", 1630),
		Person(16000, "Fernando Pessoa", 1888)
	)

//	val outputData =
//		inputData
//			.onEach { println(">> $it") }
//			.filter { it.birthYear > 1500 }
//			.map { it.name }
//			.find { it[0] == 'L' }



	val outputData =
		inputData
			//.inspect { println(">> $it") }
			.where { it.birthYear > 1500 }
			.select { it.name }
			.take(2)
			.lookup { it[0] == 'L' }



	println(outputData)
}
