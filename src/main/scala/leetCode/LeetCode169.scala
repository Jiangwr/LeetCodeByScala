package leetCode

class LeetCode169 {
  //Time:O(n) Space:O(1)
  def majorityElement(nums: Array[Int]): Int = {
    var res = 0
    var cnt = 0
    for (num <- nums) {
      if (cnt == 0) {
        res = num
        cnt = 1
      } else if (num == res) {
        cnt = cnt + 1
      } else {
        cnt = cnt - 1
      }
    }
    res
  }

  //Time:O(n) Space:O(1)
  def majorityElement2(nums: Array[Int]): Int = {
    var res = 0
    nums.foldLeft(0) { (cnt, num) =>
      if (cnt == 0) {
        res = num
        1
      } else if (res == num)
        cnt + 1
      else
        cnt - 1
    }
    res
  }
}
