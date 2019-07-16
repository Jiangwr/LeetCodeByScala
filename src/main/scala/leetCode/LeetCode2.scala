package leetCode

class
LeetCode2 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }

  //Time:O(n) Space:O(1)
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var carry = 0
    var p1 = l1
    var p2 = l2
    val dummy = new ListNode()
    var p =dummy
    while (p1 != null || p2 != null || carry != 0) {
      var sum: Int = 0;
      if (p1 != null) {
        sum = sum + p1.x
        p1 = p1.next
      }
      if (p2 != null) {
        sum = sum + p2.x
        p2 = p2.next
      }
      if (carry != 0) {
        sum += carry
      }
      p.next = new ListNode(sum % 10)
      carry = sum / 10
      p = p.next
    }
    dummy.next
  }
}
