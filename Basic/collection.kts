//fun printAll(String: Comparable<String>) {
//    for(s in strings) print("$s ")
//    println()
//}

fun main() {
    // imutible list
    val stringList = listOf("one", "two", "one")
    println(stringList.sorted())
    println(stringList[2])
    println(stringList.last())
    println(stringList.contains("two"))
    println(stringList)

    val stringSet = setOf("one", "two", "three")
    println(stringSet)


    // mutable colletion
    val rebel = arrayListOf("Mother", "Father", "Sister", "Brother")
    println(rebel.size)
    rebel.add("Cousion")
    println(rebel)
    rebel.add(0, "GrandFather")
    println(rebel)
    println(rebel.indexOf("Father"))

    rebel.remove("Cousion")
    println(rebel)


    // Map is collection of unorder key value pair
    // name is the key and phone number is value

    // imutival can't change

    val rebelVehicalMap = mapOf("Solo" to "Miilenium Falcon", "Luke" to "Landspeed")
    println(rebelVehicalMap["Solo"])
    println(rebelVehicalMap.get("Solo"))
//    println(rebelVehicalMap.getOrDefault(" "))

    // Mutable
    val rebelVehical = hashMapOf("Solo" to "Millenium falcon", "Luke" to "Landspeeder")
    rebelVehical["Safari"] = "Xwing"
    rebelVehical.put("Tata", "Nano")
    println(rebelVehical)
    rebelVehical.remove("Luke")
    println(rebelVehical)
    rebelVehical.isEmpty()

}
main()