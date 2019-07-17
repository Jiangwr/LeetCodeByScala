package leetCode

class LeetCode198 {
  //Time:O(n) Space:O(1)
  def rob(nums: Array[Int]): Int = {
    if(nums == null || nums.length == 0) {
      return 0
    }
    if (nums.length == 1) {
      return nums(0)
    }
    if (nums.length == 2) {
      return Math.max(nums(0), nums(1))
    }
    var a = nums(0)
    var b = Math.max(nums(0), nums(1))
    var i = 2
    while (i < nums.length) {
      val c = Math.max(a + nums(i), b)
      a = b
      b = c
      i += 1
    }
    b
  }
}
