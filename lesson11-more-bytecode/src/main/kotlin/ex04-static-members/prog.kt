package pt.isel.leic.lae.li42d.lesson11.ex04

val msg = "Hello, world!"

fun showMsg() = println(msg)   // acesso a msg com getstatic

fun main() {
	showMsg()                    // invocação de showMsg com invokestatic
}
