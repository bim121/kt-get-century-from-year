package mate.academy

private  val YEARS_IN_CENTURY = 100
private  val OFFSET = YEARS_IN_CENTURY - 1

fun getCentury(year: Int): Int {
    return (year + OFFSET) / YEARS_IN_CENTURY
}