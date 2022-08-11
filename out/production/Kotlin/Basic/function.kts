fun main(){

    fun hello(){
        println("I'm done with you")
    }
    hello()

    fun makeAnEntrance(line: String){
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(num: Int, num2: Int): Int{
        val goodGuys = num + num2
        return goodGuys
    }

    val rebel = calculateNumberGoodGuys(6, 7)
    // val rebel = 13

    println("Darth vader faced off against $rebel rebel scum")
    println("Darth vader faced off against ${calculateNumberGoodGuys(6, 7)} rebel scum")

    // default values
    fun vaderIsFeeling(mood: String = "Angry"){
        println(mood)
    }

    vaderIsFeeling()
    // Passing parameters
    vaderIsFeeling("meh")
}
main()