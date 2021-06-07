fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val copy = IntArray(m + n)
    nums1.copyInto(copy)
    var i = 0
    var j = 0
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
            copy[i + j] = nums1[i]
            i++
        } else {
            copy[i + j] = nums2[j]
            j++
        }
    }
    while (i < m) {
        copy[i + j] = nums1[i]
        i++
    }
    while (j < n) {
        copy[i + j] = nums2[j]
        j++
    }
    copy.copyInto(nums1)

}
fun main(args: Array<String>) {
//    val a = IntArray(12) { i -> i + 1 }
    var nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    var nums2 = intArrayOf(2, 5, 6)
    var copy = IntArray(6)

    nums1.copyInto(copy)
    copy[1] = 90
    println(nums1.toList())
    merge(nums1, 3, nums2, 3)
    println(nums1.toList())
    println(copy.toList())

    var b = Array<Any?>(3) { null }
}