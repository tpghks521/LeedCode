

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false

    val str = x.toString()
    val arr = str.split("")

    for (y in 0..(arr.lastIndex/2)) {
        if( arr[y] != arr[arr.lastIndex-y]) return false

    }
    return true
}