package kotlinexamples

class lambdafunctions {
    fun main()
        {
            val greeting: (String) -> String = { str -> str + " hello!"};
            println(greeting("thanmayee"))
        }

}