package leetCode

class LeetCode647 {

  //Time:O(n^2) Space:O(1)
  def countSubstrings(s: String): Int = {
    var i = 0
    var cnt = 0
    while (i < s.length) {
      cnt += countSubstrings(s, i, i)
      cnt += countSubstrings(s, i, i + 1)
      i = i + 1
    }
    cnt
  }

  def countSubstrings(s: String, left: Int, right: Int): Int = {
    var i = left
    var j = right
    var cnt = 0
    while (i >= 0 && j < s.length && s.charAt(j) == s.charAt(i)) {
      i -= 1
      j += 1
      cnt += 1
    }
    cnt
  }
}
