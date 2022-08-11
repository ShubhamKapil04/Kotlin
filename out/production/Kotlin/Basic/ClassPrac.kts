package Basic

open class Player(val name: String, val age: String, val gender: String){
    fun attack(){
        println("You are dead Now!")
    }

    fun defend(){
        println("You can't kill me...")
    }

    fun walk(){
        println("Let's Go....")
    }
}

class Warrior(name: String, age: String, gender: String, val power: Int): Player(name, age, gender){

    fun heroPower(){
        println("You all are dead now! ")
    }

}

class Thief(name: String, age: String, gender: String, val ultimate: String): Player(name, age, gender){

    fun VillenPower(){
        println("You can't Kill me")
    }

}

fun main(){

    val hero = Warrior("Saktiman", "Fifty", "Male", 1000)
    hero.heroPower()

    val Dabu = Thief("Sambha", "Hund", "Male", "X")
    Dabu.VillenPower()

    hero.attack()
    Dabu.defend()
    hero.walk()
}
main()
