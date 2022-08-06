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
}
main()