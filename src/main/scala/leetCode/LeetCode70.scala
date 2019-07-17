package leetCode

class LeetCode70 {

  //Time:O(n) Space:O(1)
  def climbStairs(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      var a = 1
      var b = 1
      var i = 2
      while (i <= n) {
        val c = a + b
        a = b
        b = c
        i += 1
      }
      b
    }
  }
}
