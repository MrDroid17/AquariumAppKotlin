package Aquarium.model

import kotlin.math.PI

//intialize in construnctor
open class Aquarium(var length: Int =60, var width: Int =25, var height: Int = 35) {

   /*
    var length :  Int = 80
    var width :  Int = 40
    var height :  Int = 20
    */

    /*
    //funtion for calculating volume
    fun volume(): Int{
        return length * width * height/1000
    }
    */

/*
    // can also be written as
    fun volume() = length * width * height/1000
*/

    //best way to define a property volume and override getter to return volume
    //for setting value need to make property mutable using var keyword
    open var volume : Int
        get() = length * width * height/1000
        set(value) {height = (value * 1000) /(length * width)}

    open var water = volume * 0.9

    //this constructor used to call primary constructor here
    constructor(numberOfFish: Int): this(){  
        val water = numberOfFish * 2000;
        val tank = water + water* 0.1
        height = (tank/ (length * width)).toInt()
    }

}

/**
 * Inheritance
 *
 * to inherit a class or variable or method it should be open
 * by default they are final if you inherit them throw error
 */
class TowerTank(): Aquarium() {
override var water = volume * 0.8
    override var volume : Int
        get() = (length * width* height / 1000* PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }


}