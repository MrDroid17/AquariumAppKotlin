package Aquarium.ams

import Aquarium.sensors.dirtyProcessorWithLambdas
import Aquarium.utils.ShouldChangeWater
import java.util.*

fun feedTheFish() {
     val day  = randomDay()
     val fishFood = food(day)
     println("Today is $day and fish eats $fishFood.")

    /***
     * default repeat function[]
     */
    repeat(3){
        println("Today is $day and fish eats $fishFood. Repeat $it")

    }

    /***
     * using companion objects
     */
    dirtyProcessorWithLambdas.dirtyProcessor()

    ShouldChangeWater.shouldChangeWater(day)
    ShouldChangeWater.shouldChangeWater(day, 45)
    ShouldChangeWater.shouldChangeWater(day, 20, 60)

    if(ShouldChangeWater.shouldChangeWater(day)){
        println("Today is $day Change water today")
    }

}

fun randomDay() : String {
    val weekDays = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return weekDays[Random().nextInt(7)]
}

fun food(day: String): String {
    var food = "fasting";

 /*   when(day) {
        "Sunday" -> Aquarium.ams.food = "flakes"
        "Monday" -> Aquarium.ams.food = "pelletes"
        "Tuesday" -> Aquarium.ams.food = "redworms"
        "Wednesday" -> Aquarium.ams.food = "granules"
        "Thursday" -> Aquarium.ams.food = "mosquitoes"
        "Friday" -> Aquarium.ams.food = "lettuce"
        "Saturday" -> Aquarium.ams.food = "plankton"
    }

    return Aquarium.ams.food*/

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