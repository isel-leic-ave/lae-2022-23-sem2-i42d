package pt.isel.leic.lae

import org.openjdk.jmh.annotations.*

import java.util.concurrent.TimeUnit
import java.util.*
import kotlin.reflect.KFunction

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1, warmups = 1)
@Measurement(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@Warmup(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
open class KBasicBenchmark {

	private val functionThatDoesNothing: KFunction<String?> = ::functionThatDoesNothing


	companion object {

		private val listOfWords = listOf("Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu")

		private val setOfWords = setOf("Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu")
		
	}

	@Benchmark
	fun directCall() {
		functionThatDoesNothing()
	}


	@Benchmark
	fun reflectionCall() {
		functionThatDoesNothing.call()
	}

	//@Benchmark
	fun findInList() = listOfWords.contains("Mike")

	//@Benchmark
	fun findInSet() = setOfWords.contains("Mike")


	fun functionThatDoesNothing(): String? {
		return null //return "Sport" + "Lisboa" + "e" + "Benfica"
	}
}