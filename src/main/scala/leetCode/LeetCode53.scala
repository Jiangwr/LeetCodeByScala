package leetCode

class LeetCode53 {

  def maxSubArray(nums: Array[Int]): Int = {
    var cur = nums(0)
    var max = nums(0)
    var i = 1
    while(i < nums.length) {
      if (cur >= 0) {
        cur += nums(i)
      }else {
        cur = nums(i)
      }
      if (cur > max) max = cur
      i += 1
    }
    max
  }
}
