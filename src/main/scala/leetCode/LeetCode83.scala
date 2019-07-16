package leetCode

class LeetCode83 {

  class ListNode(var _x: Int = 0) {
    var next: ListNode = null
    var x: Int = _x
  }


  //Time:O(n) Space:O(1)
  def deleteDuplicates(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    var p = head
    var next = head.next
    while (next != null) {
      if (p.x == next.x) {
        next = next.next
        p.next = next
      }else {
        p = next
      }
    }
    head
  }
}
