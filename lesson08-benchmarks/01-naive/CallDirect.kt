package pt.isel.leic.lae.benchmark.call.direct

import Util


const val N = 10
const val R = 1_000_000
val times = LongArray(N+1) { 0 }

fun main() {
	val u = Util()
	println(":: MEASURING direct call ::")
	times[0] = System.nanoTime()
	for (n in 1..N) {    // ## Number of iterations                ##
		for (r in 1..R)    // ## Number of repetitions per iteration ##
			u.functionThatDoesNothing()  // ## Method being benchmarked            ##
		times[n] = System.nanoTime()
	}
	println(":: DONE ::")
	
	// ## Result for each iteration ##
	for (n in 1..N) {
		println("t$n : ${(times[n]-times[n-1])*1.0/R}ns")
	}
}
