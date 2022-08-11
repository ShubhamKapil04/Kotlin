import java.net.URL
import javax.annotation.processing.Completion

fun main(){
    val printMessage = { message : String -> println(message) }

    printMessage("Hello Wolrd !")

    // we can pass the one or more perameters
    val sumA ={ x: Int, y:Int -> x + y }
    println(sumA(5, 4))

    val sumB : (Int, Int) -> Int = {x, y -> x + y}
    println(sumB(5, 7))
    // Unit is like Void
    fun downloadData(url: String, completion: ()-> Unit){
        // Sent a download request
        // we got back data
        // there were no network error
        completion()
        // This will help us to know the function is complete
    }

    //  Call DownloadDataFunction
    // what inside this brases that is lambda expression
    downloadData("fakeUrl.com",{
        println("The code in this block, will only run" +
        "after the completion()")
    })

    fun downloadCarData(url: String, completion: (Classes.Car) -> Unit){
        // Sent a download request
        // we got car data back
        val car = Classes.Car("Tata", "Safari", "Black")
        completion(car)
    }
    // it we have onlybone perameter

    downloadCarData("fakeUrl.com"){ car ->
        println(car.color)
        println(car.model)
    }
    downloadCarData("fakeUrl.com"){
        println(it.color)
        println(it.model)
    }

    fun downloadTruckData(url: String, completion: (Classes.Truck?, Boolean) -> Unit){
        // make the web request
        // we get the result back
        val webRequest = false
        if(webRequest){
            // recive truck data
            val truck = Classes.Truck("Tata", "F-12", 1000)
            completion(truck, true)
        }else{
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com"){ truck, success ->
        if(success == true){
            // do somthing with our truck
            truck?.tow()
        }else{
            // handle the web request failure
            println("Somthing went Wrong!")
        }
    }

}
main()