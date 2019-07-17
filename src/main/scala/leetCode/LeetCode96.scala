package leetCode

class LeetCode96 {
  //Time:O(n^2) Space:O(n)
  def numTrees(n: Int): Int = {
    val d: Array[Int] = new Array[Int](n + 1)
    d(0) = 0
    var i = 1
    while (i <= n) {
      var j = 1
      while (j <= i) {
        d(i) += d(j - 1) * d(i - j)
        j += 1
      }
      i += 1
    }
    d(n)
  }

  //Time:O(n) Space:O(1)
  def numTrees2(n: Int): Int = {
    var ans: Long = 1
    var i = 1
    while(i <= n) {
      ans = ans * (n + i) / i
      i += 1
    }
    val res = ans / (n + 1)
    res.toInt
  }
}
