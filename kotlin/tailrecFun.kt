import java.math.BigInteger

fun main() {

    println(getFibonacciNumber(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {

    return if (n == 0)
        b
    else
        getFibonacciNumber(n - 1, a + b, a)
}