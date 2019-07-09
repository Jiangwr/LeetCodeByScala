package leetCode

class LeetCode268 {

  //Time:O(n) Space:O(1)
  def missingNumber(nums: Array[Int]): Int = {
    val res = (0 to nums.length).foldLeft(0)(_ ^ _)
    nums.foldLeft(res)(_ ^ _)
  }
}
