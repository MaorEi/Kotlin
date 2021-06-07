fun main(args: Array<String>) {
    // Lambdas are function Literals, which means that they aren't declared, they are passed immediately as an expression
    // the parameters are declared as the LHS of the literal, and the RHS is the body of the function (the return value)
    val printMessage = { message: String -> println(message) } // lambda expression always surrounded by curly braces

    printMessage("Hello World!")

    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5, 3))

    val sumB: (Int, Int) -> Int = { x, y -> x + y } // rewrite it differently

    // the most common usage of a Lambda expression is when dealing with an asynchronous web request functions
    // by web request we sending a request to the web, and it's asynchronous because we don't know when it's done and we don't want to hold up all the other operations or freeze the UI until that's finish.

    fun downloadData(url: String, completion: () -> Unit) { //Unit is the equivalent of void in functions
        // sent a download request
        // we got back the data
        // there were no network errors
        completion()
    }

    // call downloadData Function
    downloadData("fakeUrl.com", { println("This code will only run after the completion()") })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // sent a download request
        // we got back car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }
    downloadCarData("tesla.com", { car -> println("${car.color} ${car.make} ${car.model}") })
    downloadCarData(
        "tesla.com",
        { println("${it.color} ${it.make} ${it.model}") }) // if we've only one parameter in the lambada we can access it via the work it

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        // make the web request
        // we got the results back
//        val webRequestSuccess = true
        val webRequestSuccess = false
        if (webRequestSuccess) {
            // received truck data
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("ford.com",
        { truck, success ->
            if (success) {
                // do something with our truck
                truck?.tow()
            } else {
                // handle the web request failure
                println("Something went wrong!")
            }
        })
}

