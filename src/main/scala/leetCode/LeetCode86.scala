package leetCode

class LeetCode86 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  def partition(head: ListNode, x: Int): ListNode = {
    val smallerHead = new ListNode()
    val greaterHead = new ListNode()
    var smaller = smallerHead
    var greater = greaterHead
    var p = head
    while (p != null) {
      if (p.x < x) {
        smaller.next = p
        smaller = smaller.next
      } else {
        greater.next = p
        greater = greater.next
      }
      p = p.next
    }
    smaller.next = greaterHead.next
    greater.next = null
    smallerHead.next
  }
}
