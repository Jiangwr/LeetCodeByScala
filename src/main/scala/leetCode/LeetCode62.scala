package leetCode

class LeetCode62 {

  //Time:O(m * n) Space:O(m * n)
  def uniquePaths(m: Int, n: Int): Int = {
    if (m < 0 || n < 0) {
      return 0
    }
    val d = Array.ofDim[Int](m, n)
    d(0)(0) = 1
    for (i <- 1 until m) {
      d(i)(0) = 1
    }
    for (j <- 1 until n) {
      d(0)(j) = 1
    }
    for (i <- 1 until m) {
      for (j <- 1 until n) {
        d(i)(j) = d(i - 1)(j) + d(i)(j - 1)
      }
    }
    d(m - 1)(n - 1)
  }

}
