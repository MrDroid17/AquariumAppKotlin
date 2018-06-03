class ShouldChangeWater {

    companion object {
        private fun getDirtySensorReading() = 20
        /***
         * example of higher order function
         * function which take or return another function as parameter
         */
        fun shouldChangeWater(day: String, temp: Int= 20, dirty: Int = getDirtySensorReading()): Boolean {

            /***
             * first way to return value
             *
            return when{
                temp > 35 -> true
                day == "Sunday" -> true
                dirty > 55 -> true
                else -> false
            }
            */
            /***
             * Second way to return value
             *
            val isTooHot = temp > 35
            val isSunday = day =="Sunday"
            val isDirty = dirty > 55
            return when{
                isTooHot -> true
                isSunday -> true
                isDirty -> true
                else -> false
            }
            *
            */

            /***
             * third way to return value
             */
            return when{
                isTooHot(temp) -> true
                isSunday(day) -> true
                isDirty(dirty) -> true
                else -> false
            }
        }


        private fun isTooHot(temp: Int) = temp > 35

        private fun isSunday(day: String) = day == "Sunday" || day == "Tuesday" || day =="Thursday"

        private fun isDirty(dirty: Int) = dirty >55

        /***
         * default function parameter
         */
        fun swim(time: Int, speed: String = "fast"){
            println("fish swim $speed")
        }
    }
}