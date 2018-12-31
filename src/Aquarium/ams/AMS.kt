package Aquarium.ams

import Aquarium.model.Aquarium
import Aquarium.sensors.dirtyProcessorWithLambdas
import Aquarium.utils.DecorationFilter
import Aquarium.utils.ShouldChangeWater
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

    /***
     * using companinon objects
     */
    ShouldChangeWater.swim(50, "slow")
    DecorationFilter.filterExample()
    dirtyProcessorWithLambdas.dirtyProcessor()
    buildAquarim()
    makeFish()
}

private fun buildAquarim(){
    //creating an instance of aquarium
    val aquarium = Aquarium()
    println("Length: ${aquarium.length}" +
            "  Width: ${aquarium.width}" +
            "  Heigth: ${aquarium.height}")

    //changing aquarium property
    aquarium.height = 35
    println("Now aquarium Height is : ${aquarium.height}")
    println("Aquarium Volume is : ${aquarium.volume}")

    aquarium.volume = 450
    println("New aquarium Height is : ${aquarium.height}")
    println("New aquarium Volume is : ${aquarium.volume}")

    val smallAquarium = Aquarium(45, 30, 48);
    println("New smallAquarium Volume is : ${smallAquarium.volume}")

    val fishInAquarium = Aquarium(14)
    println("New smallAquarium is : ${fishInAquarium.volume} in litres \n" +
            "length : ${fishInAquarium.length} \n" +
            "width : ${fishInAquarium.width} \n" +
            "height : ${fishInAquarium.height}" )

}

fun feedFish(fish: FishAction){
    // make  some food then
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecotomous()
    println("Shark: ${shark.color} \nPlecotonus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}




