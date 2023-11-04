package org.example.basic

class MaximumInStrincArrayKotlin {
    data class Height(val feet: Int, val inches: Int)

    fun findMax(arr: Array<Height>, n: Int): Int {
        var max = Int.MIN_VALUE
        for (i in 0 until n) {
            val height = arr[i].feet * 12 + arr[i].inches
            if (height > max) {
                max = height
            }
        }
        return max
    }

    fun main() {
        val n = 2
        val h1 = Height(1,2)
        val h2 = Height(2,1)
        val arr = arrayOf(h1, h2)
        println(findMax(arr, n))
    }
 }


fun main() {
    val ob = MaximumInStrincArrayKotlin()
    ob.main()
}