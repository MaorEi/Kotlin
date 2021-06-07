// it's important to understand that Kotlin doesn't have its own Collection classes.
// they're built right from the Java collection classes, and Kotlin extends their functionality.
// Arrays, Maps, Queues, Sets

fun main(args: Array<String>) {
//     one big difference in Kotlin between other languages is that Kotlin separates between mutable and immutable types.
//    immutable array type:
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin") // list is essentially an array
    println(imperials) // in Kotlin square brackets means that it's an array
    println(imperials.sorted())
    println(imperials[0])
    println(imperials.first())
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials.size)

//    mutable array type:
    val rebels = arrayListOf(
        "Leiah",
        "Luke",
        "Han Solo",
        "Man Mothma"
    )
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.add("Luke")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    rebels.removeAt(2)
    println(rebels)

//    immutable Map type:
    val rebelVehicleMap = mapOf(
        "Solo" to "Mellenium Falcon",
        "Luke" to "Landspeeder"
    )
    println(rebelVehicleMap["Solo"])
    println(rebelVehicleMap.get("Luke"))
    println(rebelVehicleMap.get("Leiah")) // the ship of Leiah so it return null (not an exception like Java)
    println(
        rebelVehicleMap.getOrDefault("Leiah", "This ship doesn't exist")
    ) // useful habbit is using default value to prevent crushing

    // mutable Map type
    val rebelVehicles = hashMapOf(
        "Solo" to "Mellenium Falcon",
        "Luke" to "Landspeeder",
        "Boba Fett" to "Rocket Pack"
    )
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles) // curly braces means it's a Map
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles.isEmpty())

}
