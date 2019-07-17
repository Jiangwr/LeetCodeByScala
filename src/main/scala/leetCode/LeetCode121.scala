package leetCode

class LeetCode121 {

  def maxProfit(prices: Array[Int]): Int = {
    if (prices == null || prices.length == 0)
      return 0
    var maxProfit = 0
    var curMin = prices(0)
    var i = 1
    while (i < prices.length) {
      val curProfit = prices(i) - curMin
      maxProfit = Math.max(curProfit, maxProfit)
      curMin = Math.min(curMin, prices(i))
      i += 1
    }
    maxProfit
  }
}
