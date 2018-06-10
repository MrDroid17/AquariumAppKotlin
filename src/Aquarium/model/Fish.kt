package Aquarium.model

class Fish(val friendly: Boolean = true, volumeNeeded :Int) {
    var size: Int = 0

    init {
        println("First init Block...")
    }

    //secondary constructor
    constructor() : this(true, 9){
        println("running secondary constructor ")
    }

    //init blocks
    /***
     * wise to have one constructor block and multiple init block if required
     */
    init {
        if(friendly){
            size = volumeNeeded
        }else{
            size = volumeNeeded * 2
        }
    }

    init {
        println("construct fish of the size $volumeNeeded final size is $size")
    }

    init {
        println("last init block")
    }

}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true, 20)
    println("is the Fish friendly${fish.friendly} needed volume ${fish.size}" )
}