package pt.isel.leic.lae

object Singleton {
    var prop1: Int = 0
    var prop2: String = "SLB"
}


var global: Int = 0

fun main() {
    Singleton.prop1 = 10

    val helloWorld = object {
        var hello = "Hello"
        var world = "World"
        // object expressions extend Any, so `override` is required on `toString()`
        override fun toString() = "$hello $world"
    }

    helloWorld.hello = "Helllloooooo"
    println(helloWorld)
    println(global)
}