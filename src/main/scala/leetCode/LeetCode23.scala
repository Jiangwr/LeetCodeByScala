package leetCode

class LeetCode23 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def mergeKLists(lists: Array[ListNode]): ListNode = {
    if (lists == null || lists.length == 0) return null
    val ans: ListNode = null
    lists.foldLeft(ans)((res, listNode) => mergeTwoLists(res, listNode))
  }

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    val dummy = new ListNode()
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
      p.next = p1
    }
    if (p2 != null) {
      p.next = p2
    }
    dummy.next
  }
}
