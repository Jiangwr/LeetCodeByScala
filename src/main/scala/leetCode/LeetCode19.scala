package leetCode

class LeetCode19 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //Time:O(n) Space:O(1)
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    val dummy = new ListNode()
    dummy.next = head
    var p = head
    var len = 0
    while (p != null) {
      len += 1
      p = p.next
    }
    if (n > len) return head
    p = dummy
    var i = 0;
    while (i < len - n) {
      p = p.next
      i = i + 1
    }
    p.next = p.next.next
    dummy.next
  }
}
