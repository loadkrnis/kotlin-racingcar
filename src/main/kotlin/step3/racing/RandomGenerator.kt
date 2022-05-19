package step3.racing

open class RandomGenerator {
    open fun getInt(range: IntRange): Int {
        return range.random()
    }
}
