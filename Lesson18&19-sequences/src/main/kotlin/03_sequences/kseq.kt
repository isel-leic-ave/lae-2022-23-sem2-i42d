package pt.isel.lae.sequences.sequences

import kotlin.random.Random

fun demoSeqOf() {
	val seqInt1to9 = sequenceOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
	val seqStrAtoU = sequenceOf("A", "E", "I", "O", "U")



	println(seqInt1to9.toList())
	println(seqStrAtoU.toList())


	val intSeq = seqInt1to9.onEach { println(">> $it") }.take(3)
	println(intSeq.toList())

	val str =
		seqStrAtoU.onEach { println(">> $it") }.drop(1).first()
	println(str)
}


fun demoGenSeq() {
	val rnds = generateSequence { Random.nextInt() }
//	rnds.forEach { println(it) }

	val nums = rnds.take(10).toList()
	println(nums)

	val oddSeq = generateSequence(1) { it + 2 }

	val oddNums = oddSeq.take(10).toList()
	println(oddNums)
}


fun f(arg: String.(i: Int)->Unit) {
	"SLB".arg(0)
}

fun f1() {
	f {
		this.substring(2)
	}
}

fun demoYield() {
	val nums = sequence {
		var x = 1
		println("a")
		yield(x++)
		println("b")
		yield(x++)
		println("c")
		yieldAll(listOf(3, 4, 5))
		println("d")
		yield(x++)
		for (i in 6..9) {
			println("... passou aqui ...")
			yield(i)
		}
		println("... mas só passa aqui depois do ciclo se concluir ...")
		yield(10)
	}

	val someNums =
		nums.onEach { println(">> $it") }.take(10)
		println(someNums.toList())
}

fun main() {
//	demoSeqOf()
//	demoGenSeq()
	demoYield()

}

