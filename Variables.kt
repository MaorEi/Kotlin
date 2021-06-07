fun main(args: Array<String>) {
    // all vals are immutable
    val name = "JohnyB"
    println(name::class.simpleName)
    println(name::class.qualifiedName)
    // name = "Batman" will fail
    val isAwesome = true

    println("Is $name awesome? The answer is : $isAwesome")

    val a = 3
    val b = 6

    println(a + b)
    // because of the type inference of kotlin we don't need to explicitly specify that it is a double\int\long\string
    val doubleNum = 123.45 //64 bit number
    val floatNum = 123.45f //32 bit number
    val longNum = 12345678908L //64 bit
    println(longNum::class.simpleName)
    //casting
    val aDouble = a.toDouble()
    println(aDouble::class.simpleName)

    //we can explicitly set the type of a variable
    val doubleNumExp : Double = 123.45 //64 bit number
    val floatNumExp : Float = 123.45f //32 bit number
    val longNumExp : Long = 12345678908L //64 bit
    var hero : String
//    println(hero) in contrast to java, there isn't null value to objects. therefore we must initialize variables.
//    println(k) same for "primitives" (even though there aren't primitives like Java they are classes
    hero = "Batman"
    println(hero)
    var k : Int

}