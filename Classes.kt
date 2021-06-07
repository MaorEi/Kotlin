import java.awt.Color

// the plan of an object. declares the name, properties and abilities.
//class Car constructor(make: String, model: String) { // here we declare the constructor and simultaneously we declare that the class has 2 properties.
//    val make = make
//    val model = model
//}

//class Car(
//    val make: String,
//    val model: String,
//    val color: String
//) { // the equivalent and more clean form of class constructor
//    fun accelerate() {
//        println("Vroom Vroom")
//    }
//
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//
//    fun tow() {
//        println("Taking the horses to the rodeo")
//    }
//
//    fun details() {
//        println("The $make $model ha a towing capacity of $towingCapacity")
//    }
//}

//class Car2 (var make: String, var model: String) { // Kotlin creates getters for val props and getters and setters for var props.
//
//}

open class Vehicle(
    val make: String,
    val model: String
) { // in kotlin by default all the classes are final\seal therefore in order to allow the class to be extended we need to declare the class as open
    open fun accelerate() { // declaring a function as open allows us to override this function by the child classes
        println("vroom vroom")
    }

    fun park() {
        println("praking the vehicle")
    }

    fun brake() {
        println("Stop")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(
    make,
    model
) { // in the child class constructor we need to call the parent class constructor with the same parameters
    override fun accelerate() { // here in the child class we declare explicitly the function we want to override
        println("We're going ludicrous mode!")
        super.accelerate() // by the super keyword as in Java we call the parent class function
    }
}

// if a class don't have any function we can get rid of the body curly braces
//class Car(make: String, model: String, var color: String) : Vehicle(make, model)

class Truck(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("headed out to the mountains!")
    }
}

fun main(args: Array<String>) {
    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()
    val truck = Truck("Ford", "F-150", 10000)
    truck.accelerate()

//    val car = Car("Toyota", "Avalon", "Red")
//    // also, kotlin handle the getters and setters for us by default:
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()
//    car.details()
//    truck.details()
}