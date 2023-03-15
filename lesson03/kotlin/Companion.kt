class MyClass {
    companion object {
        fun create(): MyClass = MyClass()
    }


    fun m1() : String { 
        return "Benfica 5 - Bruges 1"
    }    
}

fun main() {
    MyClass.create() 

    var mc = MyClass()
    mc.m1()
}