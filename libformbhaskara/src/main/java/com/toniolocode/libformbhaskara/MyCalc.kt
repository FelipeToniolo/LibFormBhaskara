package com.toniolocode.libformbhaskara

import java.lang.Math.sqrt

class MyCalc {
    companion object {
        fun Bhaskara(a: Int, b: Int, c: Int): String {
            val delta = ((b * b) - 4 * a * c)

            val x1 = ((b * (-1)) + sqrt(delta.toDouble())) / 2 * a
            val x2 = ((b * (-1)) - sqrt(delta.toDouble())) / 2 * a

            return if (delta >= 0) {
                "O resultado de 'x = $x1, e o resultado de ''x = $x2."
            } else {
                "O valor do delta é menor que 0"
            }
        }
    }
}