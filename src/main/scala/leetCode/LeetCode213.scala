package leetCode

class LeetCode213 {

  def rob(nums: Array[Int]): Int = {
    if (nums == null || nums.length == 0) {
      return 0
    }
    if (nums.length == 1) {
      return nums(0)
    }
    if (nums.length == 2) {
      return Math.max(nums(0), nums(1))
    }
    if (nums.length == 3) {
      return Math.max(nums(0), Math.max(nums(1), nums(1)))
    }
    Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1))
  }

  def rob(nums: Array[Int], start: Int, end: Int): Int = {
    var a = nums(start)
    var b = Math.max(nums(start), nums(start + 1))
    var i = start + 2
    while (i <= end) {
      val c = Math.max(a + nums(i), b)
      a = b
      b = c
      i += 1
    }
    b
  }
}
