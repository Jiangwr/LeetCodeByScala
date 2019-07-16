package leetCode

class LeetCode21 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //Time:O(n) Space:O(n)
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) l2
    else if (l2 == null) l1
    else if (l1.x < l2.x) {
      l1.next = mergeTwoLists(l1, l2.next)
      l1
    } else {
      l2.next = mergeTwoLists(l1, l2.next)
      l2
    }
  }

  //Time:O(n) Space:O(1)
  def mergeTwoLists2(l1: ListNode, l2: ListNode): ListNode = {
    val dummy: ListNode = new ListNode(0)
    var p = dummy
    var p1 = l1
    var p2 = l2
    while (p1 != null && p2 != null) {
      if (p1.x <= p2.x) {
        p.next = p1
        p1 = p1.next
      } else {
        p.next = p2
        p2 = p2.next
      }
      p = p.next
    }
    if (p1 != null) {
      p.next = p2
    } else {
      p.next = p1
    }
    dummy.next
  }

}
