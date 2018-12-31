package Aquarium.ams

/**
 * Abstract classes can have constructor and interfaces can not
 * Both have implementaion of methods
 * on interface we called them default implementaions
 * another thing that can be done is
 * Interface Delegation
 */
abstract class AquariumAbstractClass {
    abstract val color: String
}

class Shark: AquariumAbstractClass(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("Hunt and eat fish.")
    }

}


class Plecotomous: AquariumAbstractClass(), FishAction {
    override val color = "green"
    override fun eat() {
        println("Munch on Algae.")
    }
}


interface  FishAction {
    fun eat()
}