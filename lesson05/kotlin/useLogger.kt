
import Case.*

@AltName("Data")
data class Info(@AltName("Number") val num : Int, var name : String)

data class User(@AltName("user", LOWERCASE) val username : String, @AltName("pwd", UPPERCASE) var password : String)



fun main() {
	Logger.log(null)
	Logger.log("ISEL")
	Logger.log(Info(12345, "Odysseas Vlachodimos"))
	Logger.log(Info(23456, "David Neres"))
	
	Logger.log(User("odysseas", "odysseas1994"))
	
	val hmap = java.util.HashMap<Int, String>()
	hmap.put(12345, "Odysseas Vlachodimos")
	hmap.put(23456, "David Neres")
	
	Logger.log(hmap)
}
