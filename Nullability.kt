// Nullablity means that a variable can be null
fun main(args: Array<String>) {
//    in Kotlin you must initialize any variable with a value when declaring it,
//    (whether an actual value or null).
//    unless you declare variable can be null at some point Kotlin will never let it to be null

    var name: String = "JohnnyB"
//    name = null // --> null can't be a value of a non-null String

    // we can only get a NullPointerException or a crush in 4 specific cases in a Kotlin project:
//    1. specifically throwing a NullPointerException
//    2. the use of !! (two exclamation points)
//    3. external Java code causes the the exception (because java and Kotlin is completely interoperable.
//    4. Data inconsistency caused by fault initialization

    // explicitly telling Kotlin that the variable is Nullable
    var nullableName: String? = "JohnnyB"
    println(nullableName)

//    nullableName = null

    // null check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }

    // Safe Call Operator ?
//    println(nullableName.length) // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    println(nullableName?.length)

    // Elvis Operator ?:
    val len = nullableName?.length ?: -1
    val noname = nullableName ?: "No one knows me"
    println(noname)

//    !! only use this when you know a value is 100% exist for that variable
    nullableName!!.length
}