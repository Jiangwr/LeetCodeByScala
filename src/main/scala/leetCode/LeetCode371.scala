package leetCode

class LeetCode371 {

  //Time:O(n) Space:O(n)
  def getSum(a: Int, b: Int): Int = {
    if (b == 0) a else getSum(a ^ b, (a & b) << 1)
  }

  //Time:O(n) Space:O(1)
  def getSumIterative(a: Int, b: Int): Int = {
    var c = a
    var d = b
    while (d != 0) {
      val sum: Int = c ^ d
      val carry = (c & d) << 1
      c = sum
      d = carry
    }
    c
  }
}


