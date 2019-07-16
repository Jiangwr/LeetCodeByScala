package leetCode

class LeetCode206 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //Time:O(n) Space:O(1)
  def reverseList(head: ListNode): ListNode = {
    if (head == null || head == null) return null
    var cur = head
    var pre: ListNode = null
    while (cur != null) {
      val next = cur.next
      cur.next = pre
      pre = cur
      cur = next
    }
    pre
  }

}
