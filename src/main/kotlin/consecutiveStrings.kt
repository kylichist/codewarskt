//https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/kotlin
fun longestConsec(strarr: Array<String>, k: Int): String {
    return if (strarr.isEmpty() || k > strarr.size || k <= 0) ""
    else {
        val sorted = strarr.toList()
            .windowed(size = k, step = 1)
            .sortedBy { pair -> pair.totalLength() }
        sorted.first { element ->
            element.totalLength() == sorted.last().totalLength()
        }.let { pair ->
            pair.fold("") { sum, item ->
                sum + item
            }
        }
    }
}

fun List<String>.totalLength() = sumBy { item -> item.length }