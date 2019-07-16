package leetCode

class LeetCode203 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //Time:O(n) Space:O(1)
  def removeElements(head: ListNode, `val`: Int): ListNode = {
    val dummy = new ListNode()
    dummy.next = head
    var p = dummy
    var next = head
    while (next != null) {
      if (next.x == `val`) {
        p.next = next.next
      }else {
        p = p.next
      }
      next = next.next
    }
    dummy.next
  }
}
