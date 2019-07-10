package leetCode

class LeetCode461 {

  //Time:O(n) Space:O(1)
  def hammingDistance(x: Int, y: Int): Int = {
    getCountOfOne(x ^ y)
  }

  def getCountOfOne(x: Int): Int = {
    var cnt = 0
    var y = x
    while (y != 0) {
      y = y & (y - 1)
      cnt = cnt + 1
    }
    cnt
  }


  //Time:O(n) Space:O(1)
  def hammingDistance2(x: Int, y: Int): Int = {

    @annotation.tailrec // 编译检查是否可以尾递归优化，若无法优化为循环，则编译会报错
    def getCountOfOne2(x: Int, cnt: Int): Int = {
      if (x == 0) cnt else getCountOfOne2(x & (x - 1), cnt + 1)
    }

    getCountOfOne2(x ^ y, 0)
  }


}
