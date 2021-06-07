fun main(args: Array<String>) {
    fun forceChoke() = println("You've failed me for the last time Admiral...")

    forceChoke()

    fun makeAnEntrance(line: String) = println(line)

    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int = rebels + ewoks

    println("Darth Vader faced off against ${calculateNumberGoodGuys(4, 5)} rebel scum")

    fun vaderIsFeeling(mood: String = "angry") {
        if (mood == "angry"){
            println("run for the hills, Vader is $mood")
        } else{
            println("whatever you do, don't make him angry")
        }
    }

    vaderIsFeeling()
    vaderIsFeeling("meh")
}