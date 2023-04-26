package pt.isel.leic.lae.lesson11.example04

val msg = "Hello, world!"

fun showMsg() = println(msg)   // acesso a msg com getstatic

fun main() {
	showMsg()                    // invocação de showMsg com invokestatic
}
