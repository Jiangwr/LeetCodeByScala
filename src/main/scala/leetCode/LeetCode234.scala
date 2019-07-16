package leetCode

class LeetCode234 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //Time:O(n) Space:O(1)
  def isPalindrome(head: ListNode): Boolean = {
    if (head == null) return true
    var len: Int = 0
    var p: ListNode = head
    while (p != null) {
      p = p.next
      len = len + 1
    }
    var pre: ListNode = null
    var cur = head
    var i = 0
    while (i < len / 2) {
      val next = cur.next
      cur.next = pre
      pre = cur
      cur = next
      i = i + 1
    }
    if (len % 2 == 1) cur = cur.next
    while (pre != null) {
      if (pre.x != cur.x) {
        return false
      } else {
        pre = pre.next
        cur = cur.next
      }
    }
    true

  }
}
