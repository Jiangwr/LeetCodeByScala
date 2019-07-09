package leetCode

class LeetCode136 {

  //Time:O(n) Space:O(1)
  def singleNumber(nums: Array[Int]): Int = {
    var res = 0
    for (num <- nums) res = res ^ num
    res
  }

  //Time:O(n) Space:O(1)
  def singleNumber2(nums: Array[Int]): Int = {
    nums.foldLeft(0)((res, num) => res ^ num)
  }

}
