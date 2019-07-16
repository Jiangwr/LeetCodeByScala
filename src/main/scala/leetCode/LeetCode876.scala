package leetCode

class LeetCode876 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //Time:O(n) Space:O(1)
  def middleNode(head: ListNode): ListNode = {
    val dummy: ListNode = new ListNode()
    dummy.next = head
    var len = 0
    var p = head
    while (p != null) {
      p = p.next
      len += 1
    }
    p = dummy
    var i = 0
    while(i < len / 2) {
      i += 1
      p = p.next
    }
    p.next
  }
}
