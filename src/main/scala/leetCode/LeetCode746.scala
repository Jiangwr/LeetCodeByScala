package leetCode

class LeetCode746 {
  def minCostClimbingStairs(cost: Array[Int]): Int = {
    if (cost == null || cost.length == 0) {
      return 0
    }
    if (cost.length == 1) {
      return cost(0)
    }
    var a = cost(0)
    var b = cost(1)
    var i = 2
    val len = cost.length
    while (i < len) {
      val c = Math.min(a, b) + cost(i)
      a = b
      b = c
      i += 1
    }
    Math.min(a, b)
  }
}
