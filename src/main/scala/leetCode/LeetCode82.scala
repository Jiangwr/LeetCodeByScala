package leetCode

class LeetCode82 {
  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //Time:O(n) Space:O(1)
  def deleteDuplicates(head: ListNode): ListNode = {
    val dummy = new ListNode()
    dummy.next = head
    var p = dummy
    var cur = p
    while (cur != null) {
      while (cur.next != null && cur.x == cur.next.x)
        cur = cur.next
      if (p.next == cur) {
        p = p.next
      }else {
        p.next = cur.next
      }
      cur = cur.next
    }
    dummy.next
  }
}
