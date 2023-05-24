package pt.isel.leic.lae.codegen

import java.io.*
import org.cojen.maker.*
import org.objectweb.asm.ClassReader
import org.objectweb.asm.util.TraceClassVisitor
import java.lang.reflect.Method

/*
 * Basic example taken from Cojen/Maker documentation.
 * Creates a class with a generated name and a single static method, run:
 * 
 * public class #SomeName# {
 *   public #SomeName#() { super(); }
 *
 *   public static void run()
 *     System.out.println("Hello, generated world!");
 *   }
 * }
 *
 * The static method run is then invoked via reflection.
 *
 */

fun printBytecodes(bytes: ByteArray) {
	val reader = ClassReader(bytes)
	val tcv = TraceClassVisitor(PrintWriter(System.out))
	reader.accept(tcv, 0)
}

fun main() {
	var classMaker = ClassMaker.begin().public_()
	var constructorMaker: MethodMaker = classMaker.addConstructor().public_()

	var runMethod: MethodMaker = classMaker.addMethod(null, "run").public_().static_()
	runMethod.`var`(System::class.java).field("out").invoke("println", "Hello, generated world!")

//	var generatedClassBytes: ByteArray? = classMaker.finishBytes()
//	printBytecodes(generatedClassBytes!!)
	var generatedClass: Class<*> = classMaker.finish()
	var constructor = generatedClass.getConstructor()


	// Calling run through reflection
	var method: Method = generatedClass.getMethod("run");
	method.invoke(null)






}
