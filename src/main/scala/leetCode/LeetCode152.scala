package leetCode

class LeetCode152 {

  def maxProduct(nums: Array[Int]): Int = {
    if (nums == null || nums.length == 0) {
      return 0
    }
    var curMax = nums(0)
    var curMin = nums(0)
    var max = nums(0)
    var i = 1
    while (i < nums.length) {
      val a = curMax * nums(i)
      val b = curMin * nums(i)
      val c = nums(i)
      curMax = Math.max(a, Math.max(b, c))
      curMin = Math.min(a, Math.min(b, c))
      max = Math.max(curMax, max)
      i += 1
    }
    max
  }
}
