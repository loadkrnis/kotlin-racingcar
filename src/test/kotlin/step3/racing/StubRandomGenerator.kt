package step3.racing

class StubRandomGenerator : RandomGenerator() {
    private val result: MutableList<Int> = mutableListOf()
    override fun getInt(range: IntRange): Int {
        return result.removeLast()
    }

    fun addResult(values: List<Int>) = values.forEach { this.result.add(0, it) }
}
