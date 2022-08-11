import java.awt.Color
import java.security.DrbgParameters.Capability

//class Car constructor(made: String, model: String){
//    val made = made
//    val model = model
//}

//class Car(val made: String, val model : String, val color : String){
//    fun accelerate() {
//            println("vroom vroom....")
//    }
//
//    fun details() {
//        println("This is a $color $made $model")
//    }
//
//}

open class Vehical(val make : String, val model : String){
    // Method
    open fun accelerate(){
        println("Vroom vroom")
    }
    fun park(){
        println("parking the vehical")
    }
    fun brake(){
        println("STOP")
    }

}

class Car(make: String, model: String, var color: String) : Vehical(make, model){
    override fun accelerate() {
        println("We are going Superfast mode!")
    }
}

class Truck(make: String, model: String, val towingCapability: Int){

}
//
//class Truck(val made: String, val model: String, val towingCapacity: Int){
//    fun tow(){
//        println("Taking the hourse to the rodeo")
//    }
//
//    fun detail(){
//        println("The $made $model has a towing capacity of $towingCapacity lbs")
//    }
//}

fun main(){

    val tesla = Car("Tasla", "Models", "Red")
    tesla.accelerate()

    val truck = Truck("TATA", "F-120", 10000)

//    val car = Car("Audi", "A7", "Red")
//    println(car.made)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("TATA", "A34", 12000)
//    truck.tow()
//    truck.detail()
}
main()