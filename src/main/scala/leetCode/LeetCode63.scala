package leetCode

class LeetCode63 {
  //Time:O(m*n) Space:O(m*n)
  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    if (obstacleGrid == null || obstacleGrid.length < 0) {
      return 0
    }
    val m = obstacleGrid.length
    val n = obstacleGrid(0).length
    val d = Array.ofDim[Int](m, n)
    if (obstacleGrid(0)(0) == 1)
      d(0)(0) = 0
    else
      d(0)(0) = 1
    for (i <- 1 until m) {
      if (obstacleGrid(i)(0) == 0)
        d(i)(0) += d(i - 1)(0)
      else
        d(i)(0) = 0

    }
    for (j <- 1 until n) {
      if (obstacleGrid(0)(j) == 0)
        d(0)(j) += d(0)(j - 1)
      else
        d(0)(j) = 0
    }
    for (i <- 1 until m) {
      for (j <- 1 until n) {
        if (obstacleGrid(i)(j) == 1)
          d(i)(j) = 0
        else
          d(i)(j) = d(i - 1)(j) + d(i)(j - 1)
      }
    }
    d(m - 1)(n - 1)
  }
}
