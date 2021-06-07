import java.util.*

fun main(args: Array<String>) {
//    there are 2 types of strings in Kotlin:
//    1. escaped string - which means we can you escaped characters in it
//            escaped characters: \n, \t, \b, \r, \", \', \\, \$
//    2. raw string (multiline string) - the string is stored as it is.
    val str = "May the 4th be with you"
    println(str)

    val str1 = "My dad said the funniest thing he said \"a Joke\""

    val rawCrawl = """ A long time ago,
        in a galaxy
        far, far, away...
        BUMM BUMM BUMMMMM"""
    println(rawCrawl)
    var rawCrawlTrimmed = """| A long time ago,
        |  in a galaxy
        |   far, far, away...
        |    BUMM BUMM BUMMMMM
    """.trimMargin() //trimmed the whitespaces before the | (pipe character by default)
    println(rawCrawlTrimmed)
    rawCrawlTrimmed = """> A long time ago,
        >  in a galaxy
        >   far, far, away...
        >    BUMM BUMM BUMMMMM
    """.trimMargin(">") // and of course we can decide what is the marginPrefix
    println(rawCrawlTrimmed)

//    for(char in str){
//        print(char)
//    }

//    some useful methods
    val contentEquals = str.contentEquals("May the force be with you.")

    println(contentEquals)

    println(str.contains("May", true))
    println(str.uppercase())
    println(str.lowercase())

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    println(str.subSequence(4, 11))

//    string templates
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27
    println("$luke has  a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    println("Luke\'s full name $luke has ${luke.uppercase()} characters")
}