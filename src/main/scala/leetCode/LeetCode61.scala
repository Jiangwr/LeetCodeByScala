package leetCode

class LeetCode61 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def rotateRight(head: ListNode, k: Int): ListNode = {
    if (head == null) {
      return null
    }
    val dummy = new ListNode()
    dummy.next = head
    var len = 1
    var p = head
    while (p.next != null) {
      len += 1
      p = p.next
    }
    p.next = head
    var n = k % len
    p = dummy
    var i = 0
    while (i < len - n) {
      p = p.next
      i += 1
    }
    val newHead = p.next
    p.next = null
    newHead
  }
}
