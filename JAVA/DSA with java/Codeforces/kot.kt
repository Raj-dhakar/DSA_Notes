import java.io.*
import java.util.*

val out = FastWriter()
val `in` = FastScanner()

fun main(args: Array<String>) {
    try {
        // int testCases = 1;
        val testCases = `in`.nextInt()
        var t = 0
        while (t++ < testCases) {
            // write code here
            rajdhakar2003(testCases, t)
        }
        out.close()
    } catch (e: Exception) {
        return
    }
}

private fun rajdhakar2003(testcase: Int, t: Int) {
    // Your code here

    val n = `in`.nextInt()

    if (n < 3) {
        out.println(n)
        return
    }
    val dp = Array<Int?>(n + 1) { null }
    val arr = arrayOf(3, 5)

    for (i in 0..2) dp[i] = i

    for (i in 3..n) {
        var ans = Int.MAX_VALUE
        for (num in arr) {
            if (i - num >= 0) ans = minOf(ans, dp[i - num] ?: Int.MAX_VALUE)
        }
        dp[i] = ans
    }

    dp[n]?.let { out.println(it) }


}

class FastScanner {
    private var br: BufferedReader? = null
    private var st: StringTokenizer? = null

    constructor(s: String) {
        try {
            br = BufferedReader(FileReader(s))
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
    }

    constructor() {
        br = BufferedReader(InputStreamReader(System.`in`))
    }

    operator fun next(): String {
        while (st == null || !st!!.hasMoreElements()) {
            try {
                st = StringTokenizer(br!!.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return st!!.nextToken()
    }

    fun nextInt(): Int {
        return next().toInt()
    }

    fun nextLong(): Long {
        return next().toLong()
    }

    fun nextDouble(): Double {
        return next().toDouble()
    }
}

class FastWriter {
    private val bw: BufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    fun print(obj: Any) {
        try {
            bw.append("$obj ")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun println(obj: Any) {
        print(obj)
        try {
            bw.append("\n")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun close() {
        try {
            bw.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
