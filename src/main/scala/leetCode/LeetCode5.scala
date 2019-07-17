package leetCode

class LeetCode5 {


  //Time:O(n^2) Space:O(1)
  def longestPalindrome(s: String): String = {
    var maxLen = 0
    var i = 0
    var start = 0
    while(i < s.length) {
      val len1 = longestPalindrome(s, i, i)
      val len2 = longestPalindrome(s, i, i + 1)
      val len = Math.max(len1, len2)
      if(len > maxLen) {
        start = i - (len - 1) / 2
        maxLen = len
      }
      i += 1
    }
    s.substring(start, start + maxLen)
  }

  def longestPalindrome(s: String, left: Int, right: Int): Int = {
    var i = left
    var j = right
    while (i >= 0 && j < s.length && s.charAt(i) == s.charAt(j)) {
      i -= 1
      j += 1
    }
    //j - 1 , i + 1
    j - i - 1
  }
}
