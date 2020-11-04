import kotlin.test.assertEquals

fun main() {
    testing(longestConsec(arrayOf(), 1), "asdasdadsd")
    testing(
        longestConsec(
            arrayOf(
                "zone",
                "abigail",
                "theta",
                "form",
                "libe",
                "zas",
                "theta",
                "abigail"
            ), 2
        ), "abigailtheta"
    )
    testing(
        longestConsec(
            arrayOf(
                "ejjjjmmtthh",
                "zxxuueeg",
                "aanlljrrrxx",
                "dqqqaaabbb",
                "oocccffuucccjjjkkkjyyyeehh"
            ), 1
        ), "oocccffuucccjjjkkkjyyyeehh"
    )
}

private fun testing(actual: String, expected: String) {
    assertEquals(expected, actual)
}