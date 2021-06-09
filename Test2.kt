fun sortedSquares(nums: IntArray): IntArray {
    val n = nums.size
    val power = nums.map { e -> e * e }.toIntArray()
    if (n <= 1)
        return power
    val result = IntArray(n)
    var i = 0
    while (i < n - 1 && power[i] >= power[i + 1])
        i++
    if (i == 0)
        return power
    if (i == n - 1) {
        power.reverse()
        return power
    }
    var j = i - 1
    var k = 0
    while (j >= 0 && i < n) {
        if (power[j] < power[i]) {
            result[k] = power[j]
            j--
        } else {
            result[k] = power[i]
            i++
        }
        k++
    }
    if (j < 0) {
        while (i < n) {
            result[k] = power[i]
            i++
            k++
        }
    } else {
        while (j >= 0) {
            result[k] = power[j]
            j--
            k++
        }
    }
    return result
}


fun main() {
    val nums = intArrayOf(-4, -4, -3)
    val result = sortedSquares(nums)
    println(result.toList())
}