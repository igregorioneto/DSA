package org.example.basic


fun main(args: Array<String>) {
    val S: String = "GEEKS FOR GEEKS";
    val ob = StringReversalKotlin();
    println(ob.reverseString(S));
}

class StringReversalKotlin {
    fun reverseString(s: String): String {
        val sb = StringBuilder();
        for (i in s.length - 1 downTo 0) {
            val c = s[i];
            if (c != ' ' && sb.indexOf(c.toString()) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}