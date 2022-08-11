fun main(){

    val a = 2
    val b = 3

    if (a == b){
        println("A does in fact B")
    }

    if( a != b){
        println("A does not equal B")
    }


    val accountBalance = 100
    val price = 500

    if (accountBalance >= price){
        println("You can buy this.")
    }
    else{
        println("You  don't have Sufficent Ammount")
    }

    val degrees = 60
    if (degrees >= 70){
        println("This is some nice weather")
    }else if (degrees < 70 && degrees >= 50){
        println("Grab a sweater")
    }else{
        println("Bhai Thandi hai bhoot")
   }

    val  isHungary = false
    val isBoard = true

    if(isHungary == true || isBoard == true){
        println("Lets get Pizza!")
    }
    if(isHungary || isBoard ){
        println("Lets get Pizza!")
    }

    val x = 7

    when (x){
         1 -> println("x == 1")
         2 -> println("x == 2")
         else -> println("x does not equal 1 or 2")
    }

    fun vanderIsFelling(Mood: String = "angry"){
        if(Mood == "angry"){
            println("run for the hills, Vader is $Mood")
        } else{
            println("whatever you do, don't make him angry")
        }
    }

    vanderIsFelling("Happy")
}
main()