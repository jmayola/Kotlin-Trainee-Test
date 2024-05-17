var peña:String = "Hola mami"
var peñaBad:String = "Hola roma"
fun main (){
    println(peña.toString())
    println(peña.compareTo("Hola peña"))
    if(peña.equals("Hola mami")){
        println("tequieromami")
    }
    println(peña.get(1))
    println(peña.hashCode())
    println(peña.plus(", te quiero"))
    println(peña.substring(0,3))
    println(peña.toUpperCase())
    println(peña.toLowerCase())
    println(peña.indexOf('a'))
    println(peña.lastIndexOf('m'))
}
