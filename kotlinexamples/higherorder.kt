package kotlinexamples

class higherorder {
}

fun encodeMsg(msg : String, encode: (String) -> String): String {
            return encode(msg)
    }

fun main()
    {
        val temp : (String) -> String = { str -> str.uppercase()}
        println(encodeMsg("thanmayee",temp))
    }
