package step2.calculator

class Splitter(expression: List<String>?) {
    val left: Long
    val right: Long
    val operator: Operator
    val hasOther: Boolean
    val other: List<String>

    init {
        expression ?: throw IllegalArgumentException("유효하지 않은 입력 값입니다.")
        expression.let {
            this.left = it[0].toLongOrThrow()
            this.operator = Operator.find(it[1])
            this.right = it[2].toLongOrThrow()
            this.hasOther = it.size > 3
            this.other = it.drop(3)
        }
    }
}
