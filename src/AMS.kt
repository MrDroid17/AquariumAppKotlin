import java.util.*

fun main(args: Array<String>){
    println("Good Evening ${args[0]} ${args[1]}")

    val isUnit = println("this is a expression");
    println(isUnit)

    //val random: Random
    val temp = listOf(23, 34, 11, 9 ,15, 26)
    val isHot = temp[Random().nextInt(6)] > 20
    println(isHot)

    val message = "You are ${if(temp[Random().nextInt(6)]  >20) "Fried" else "Safe"} fish"
    println(message)

    feedTheFish()
    swim(50,"slow")
}


