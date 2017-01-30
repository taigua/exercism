/**
 * Created by Corwin Dong on 2016/8/27.
 */

import java.util.Random

class Robot {
    var name = genName()
        private set

    fun reset() {
        name = genName()
    }

    private fun genName() : String {
        var r = Random()
        return (1..2).map { (r.nextInt(26) + 'A'.toInt()).toChar() }.joinToString("") +
                (1..3).map { (r.nextInt(10) + '0'.toInt()).toChar() }.joinToString("")
    }
}