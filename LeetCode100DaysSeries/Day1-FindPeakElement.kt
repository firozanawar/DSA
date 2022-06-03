package LeetCode100DaysSeries

/**
 * Find Peak Element
 * https://leetcode.com/problems/find-peak-element/
 */
fun main() {
    val num = arrayOf(1, 2, 1, 3, 5, 6, 4)
    println(findPickElement(num))
}

fun findPickElement(arr: Array<Int>): Int {
    var low = 0
    var high = arr.size-1

    while (low < high) {
        val mid = low + (high - low) / 2
        if(arr[mid] < arr[mid+1]){
            low = mid +1
        }else{
            high = mid
        }
    }

    return low;
}