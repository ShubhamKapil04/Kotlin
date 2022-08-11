fun main(){
    val str = "May the force be with you"
    println(str)

    // Row String

    val rowCrawl = """ A long time ago,
        |in a galaxy
        |far, far, away...
        |Bumm Bumm Bumm
    """.trimMargin()

    println(rowCrawl)

    // printing the each char into new line
//    for (char in str){
//        println(char)
//    }

    val contentEquals = str.contentEquals("May the force be with you")
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val upperCase = str.toUpperCase()
    val lower = str.toLowerCase()

    println(upperCase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)


    val kapil = "Kapil SkyWalker"
    val lightSaberColor = "green"
    val vehical = "landspeeder"

    println("$kapil has a $lightSaberColor lightSaber and drives a $vehical")

}
main()