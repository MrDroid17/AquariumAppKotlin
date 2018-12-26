package Aquarium.sensors

/**
 * OBJECT ORIENTED TERMINOLOGY
 *
 * Classes are blueprint for object
 * objects are instances of classes
 * Properties are characteristics of classes
 * Method are functionality of a class
 * implementaion are a specification a class can implement
 *
 */

/***
 * PACKAGE VISIBILITY
 *
 * public - default everywhere
 * private - file
 * internal - module
 */

/**
 * CLASS VISIBILITY
 *
 * public - default , class and public member
 * private - inside class , subclass can't see
 * protected - inside class subclasses can't see
 * internal - module
 */
class dirtyProcessorWithLambdas {

    companion object {
        var dirty = 20

        //val waterFilter:(Int) -> Int = { dirty: Int -> dirty/2}
        private val waterFilter:(Int) -> Int = { dirty -> dirty/2}// type is inferreed here from context
        private fun feedFish (dirty: Int) = dirty + 10  //normal function

        private fun updateDirty(dirty: Int, operation: (Int) -> Int ): Int {
            return operation(dirty)
        }

        fun dirtyProcessor() {
            dirty = updateDirty(dirty, waterFilter) // higher order function
            println("your are without Lambda for dirty : $dirty")

            dirty = updateDirty(dirty, Companion::feedFish) // :: will pass the  reference of a named function
            println("your are using Reference of feedFish for dirty : $dirty")

            //Lambda
            /**
             * Lamdas or anynomous function of function literals
             * Lambdas argument go on left side of function arrow and function body on right
             * real power of lambda happens when we make higher order functions
             * Higher order function = any function take another function as argumnet
             */

            /**
             * When you combine higher order function with lambdas it is called last parameter called syntax
             */
            dirty = updateDirty(dirty) { dirty ->
                dirty + 50
            }
            println("your are using Lambda for dirty : $dirty")

            // filter() and repeat() aretwo lambdas function in standard library
        }
    }
}