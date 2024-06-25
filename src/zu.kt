//import java.util.*
//
//const val ASIZE = 256
//var m = 0
//var n = 0
//lateinit var x: CharArray
//lateinit var y: CharArray
//
//lateinit var a,b : CharArray
//
//fun nhap() {
//    val scanner = Scanner(System.`in`)
//    println("Nhap x: ")
//    x = scanner.nextLine().toCharArray()
//    m = x.size
//    println("Nhap y: ")
//    y = scanner.nextLine().toCharArray()
//    n = y.size
//}
//
//fun suffixes(x: CharArray, m: Int, suff: IntArray) {
//    var f = 0
//    var g: Int
//    suff[m - 1] = m
//    g = m - 1
//    for (i in m - 2 downTo 0) {
//        if (i > g && suff[i + m - 1 - f] < i - g) {
//            suff[i] = suff[i + m - 1 - f]
//        } else {
//            g = if (i < g) i else g
//            f = i
//            while (g >= 0 && x[g] == x[g + m - 1 - f]) {
//                --g
//            }
//            suff[i] = f - g
//        }
//    }
//}
//
//fun preBmGs(x: CharArray, m: Int, bmGs: IntArray) {
//    val suff = IntArray(m)
//    suffixes(x, m, suff)
//    for (i in 0 until m) {
//        bmGs[i] = m
//    }
//    var j = 0
//    for (i in m - 1 downTo 0) {
//        if (suff[i] == i + 1) {
//            while (j < m - 1 - i) {
//                if (bmGs[j] == m) {
//                    bmGs[j] = m - 1 - i
//                }
//                ++j
//            }
//        }
//    }
//    for (i in 0 until m - 1) {
//        bmGs[m - 1 - suff[i]] = m - 1 - i
//    }
//}
//
//fun preZtBc(x: CharArray, m: Int, ztBc: Array<IntArray>) {
//    for (i in 0 until ASIZE) {
//        for (j in 0 until ASIZE) {
//            ztBc[i][j] = m
//        }
//    }
//    for (i in 0 until ASIZE) {
//        ztBc[i][x[0].toInt()] = m - 1
//    }
//    for (i in 1 until m - 1) {
//        ztBc[x[i - 1].toInt()][x[i].toInt()] = m - 1 - i
//    }
//}
//
//fun ZT(x: CharArray, m: Int, y: CharArray, n: Int) {
//    val ztBc = Array(ASIZE) { IntArray(ASIZE) }
//    val bmGs = IntArray(m)
//    preZtBc(x, m, ztBc)
//    preBmGs(x, m, bmGs)
//    var j = 0
//    while (j <= n - m) {
//        var i = m - 1
//        while (i >= 0 && x[i] == y[i + j]) {
//            --i
//        }
//        if (i < 0) {
//            println("position is $j")
//            j += bmGs[0]
//        } else {
//            j += maxOf(bmGs[i], ztBc[y[j + m - 2].toInt()][y[j + m - 1].toInt()])
//        }
//    }
//}
//
//fun main() {
//    nhap()
//    ZT(x, m, y, n)
//}
