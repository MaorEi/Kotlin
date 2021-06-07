fun main(args: Array<String>) {
    val a = 2
    val b = 3
    if (a == b) {
        println("a equals to b")
    }
    if (a != b) {
        println("a doesn't equal b")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price) {
        println("You can buy this!")
    } else {
        println("Sorry you're broke!")
    }

    val degrees = 60
    // == != => <= < >
    if (degrees >= 70) {
        println("This is some nice weather!")
    } else if (degrees in 50..69) {
        println("Grab a sweater")
    } else {
        println("Holy crap it's cold!")
    }

    val isHungry = false
    val isBored = true

    if (isHungry || isBored) {
        println("Let's get a Pizza")
    }

    // like switch case
    val x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        //we must do it exhaustive, so it must check all possible x inputs
        else -> println("x != 1 or 2")
    }
}