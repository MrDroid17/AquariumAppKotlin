import java.util.*

fun feedTheFish() {
     val day  = randomDay()
     val fishFood = food(day)
     println("Today is $day and fish eats $fishFood.")
}

/***
 * default function parameter
 */
fun swim(time: Int, speed: String = "fast"){
    println("fish swim $speed")
}

fun randomDay() : String {
    val weekDays = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return weekDays[Random().nextInt(7)]
}

fun food(day: String): String {
    var food = "fasting";

 /*   when(day) {
        "Sunday" -> food = "flakes"
        "Monday" -> food = "pelletes"
        "Tuesday" -> food = "redworms"
        "Wednesday" -> food = "granules"
        "Thursday" -> food = "mosquitoes"
        "Friday" -> food = "lettuce"
        "Saturday" -> food = "plankton"
    }

    return food*/

    return when(day) {
        "Sunday" -> "flakes"
        "Monday" -> "pelletes"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "lettuce"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}