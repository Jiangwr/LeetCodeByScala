package leetCode


import scala.collection.mutable.Stack

class LeetCode101 {

  class TreeNode(_val: Int) {
    var value: Int = _val
    var left: TreeNode = null
    val right: TreeNode = null
  }

  //time:O(n) Space:O(n)
  def isSymmetric(root: TreeNode): Boolean = {
    if (root == null) return true
    isSymmetric(root.left, root.right)
  }

  def isSymmetric(s: TreeNode, t: TreeNode): Boolean = {
    if (s == null && t == null) return true
    if (s == null || t == null) return false
    s.value == t.value && isSymmetric(s.left, t.right) && isSymmetric(s.right, t.left)
  }

  //time:O(n) Space:O(n)
  def isSymmetric2(root: TreeNode): Boolean = {
    if (root == null) return true
    val stack = new Stack[TreeNode]()
    stack.push(root.left)
    stack.push(root.right)
    while (!stack.isEmpty) {
      val s = stack.pop()
      val t = stack.pop()
      if (!(s == null && t == null)) {
        if (s == null || t == null) return false
        if (s.value != t.value) return false
        stack.push(s.left)
        stack.push(t.right)
        stack.push(s.right)
        stack.push(t.left)
      }
    }
    true
  }
}
