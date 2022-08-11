fun main(){

//    var name : String = "Shubham"
//    name = null

    var nullableName : String? = "DO I really exist? "
//    nullableName= null

    // Null Check
    var length = 0
    if(nullableName != null) {
        length = nullableName.length
    }else{
        length = -1
    }

    val l = if(nullableName != null) nullableName.length else -1

    // Second method Safe call operator ?

    println(nullableName?.length)

    // Third Method is Elvis Operator

    var len =  nullableName?.length ?: -1
    val noName = nullableName ?: "No one Knows me..."
    println(noName)

    // !!
    println(nullableName !!.length)

    println(len)

}
main()