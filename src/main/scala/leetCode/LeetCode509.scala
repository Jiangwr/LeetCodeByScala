package leetCode

class LeetCode509 {
  def fib(N: Int): Int = {
    if (N <= 0) {
      return 0
    }
    if (N == 1) {
      return 1
    }
    var a = 0
    var b = 1
    var i = 2
    while (i <= N) {
      val c = a + b
      a = b
      b = c
      i += 1
    }
    b
  }
}
