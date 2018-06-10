package Aquarium.sensors

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
            dirty = updateDirty(dirty, waterFilter)
            println("your are without Lambda for dirty : $dirty")

            dirty = updateDirty(dirty, Companion::feedFish) // :: will pass the  reference of a typed function
            println("your are using Reference of feedFish for dirty : $dirty")

            //Lambda
            dirty = updateDirty(dirty, { dirty ->
                dirty + 50
            })
            println("your are using Lambda for dirty : $dirty")
        }
    }
}