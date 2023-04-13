package pt.isel.leic.lae.lesson10
fun sum(a : Int, b : Int?) : Int = (a + (b ?: 0))

fun xsum(a : Int, b : Int?) : Int? =
	if (b == null) null else a + b

fun showStudent(s: Student) {
	println(s)
}
fun main() {
	println(sum(3, 4))
	println(sum(8, null))
	println(xsum(3, 4))
	println(xsum(8, null))

	val s = Student(2, "Bah")
	showStudent(s)
}


data class Student(val number: Int, val name: String)