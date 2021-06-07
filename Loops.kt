fun main(args: Array<String>) {
    val rebels = arrayListOf(
        "Leiah",
        "Luke",
        "Han Solo",
        "Man Mothma"
    )
    val rebelVehicles = hashMapOf(
        "Solo" to "Mellenium Falcon",
        "Luke" to "Landspeeder",
        "Boba Fett" to "Rocket Pack"
    )
    for (rebel in rebels){
        println(rebel)
    }

    for ((key, value ) in rebelVehicles){
        println("Name: $key, Vehicle: $value")
    }

    var x = 10
    while (x > 0){
        println(x)
        x--
    }
}