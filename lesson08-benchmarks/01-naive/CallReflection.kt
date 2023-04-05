package pt.isel.leic.lae.benchmark.call.reflection

import Util

const val N = 10
const val R = 1_000_000
val times = LongArray(N +1) { 0 }



fun main() {
	val u = Util()

	val functionThatDoesNothing = Util::functionThatDoesNothing
	//print(functionThatDoesNothing.annotations)

	
	println(":: MEASURING ::")
	times[0] = System.nanoTime()
	for (n in 1..N) {    // ## Number of iterations                ##
		for (r in 1..R)    // ## Number of repetitions per iteration ##
			functionThatDoesNothing.call(u)  // ## Method being benchmarked            ##
		times[n] = System.nanoTime()
	}
	println(":: DONE ::")
	
	// ## Result for each iteration ##
	for (n in 1..N) {
		println("t$n : ${(times[n]-times[n-1])*1.0/R}ns")
	}
}
