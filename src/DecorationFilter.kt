
class DecorationFilter {

    companion object {
        private val decoration = listOf("rock", "pagoda", "sea stones", "plastic plant", "dummy fish", "alligator", "flowerpot", "crab")

        fun filterExample(){
            eagerFilterExample()
            lazyFilterExample()
            lazyMapFilterExample()
        }

        private fun eagerFilterExample(){
            val eager01 = decoration.filter { true }
            val eager02 = decoration.filter { it[0]== 's' }
            println("eager01 filter list is $eager01")
            println("eager02 filter list is $eager02")
        }

        private fun lazyFilterExample(){
            val lazyFiltered = decoration.asSequence().filter { it[0] =='p' }
            println("lazyFilters as sequence $lazyFiltered")
            println("lazyFilters as element of list ${lazyFiltered.toList()}")
        }

        private fun lazyMapFilterExample(){
            val lazyMap = decoration.asSequence().map { println("map: $it")
            it}
            println(lazyMap)
            println("first: ${ lazyMap.first() }")
            println("all: ${ lazyMap.toList() }")
        }
    }
}