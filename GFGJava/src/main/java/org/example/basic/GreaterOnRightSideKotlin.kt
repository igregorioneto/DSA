package org.example.basic

fun main() {
    val N: Int = 4;
    val Arr = intArrayOf(2, 3, 1, 9);
    val ob = GreaterOnRightSideKotlin();
    ob.nextGreatest(Arr, N);
    println();
    for (e in Arr) {
        print("$e ");
    }
}

class GreaterOnRightSideKotlin {
    fun nextGreatest(arr: IntArray, n: Int) {
        var maxFromRight = -1;
        val result = IntArray(n);

        for (i in n - 1 downTo 0) {
            result[i] = maxFromRight;
            maxFromRight = maxOf(maxFromRight, arr[i]);
        }

        result[n - 1] = -1;
        System.arraycopy(result, 0, arr,0, n);
    }

    fun nextGreatest2(arr: IntArray, n: Int) {
        for (i in 0 until arr.size) {
            var max = Int.MIN_VALUE;
            for (j in i + 1 until arr.size) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.size - 1] = -1;
    }

}