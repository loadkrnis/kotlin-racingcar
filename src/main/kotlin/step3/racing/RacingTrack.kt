package step3.racing

class RacingTrack(
    racerNames: List<String>,
    private val times: Int,
    private val randomGenerator: RandomGenerator
) {
    val racers: List<Car> = racerNames.map { Car(it) }
    val raceHistory: RaceHistory = RaceHistory(times)

    fun start() = repeat(times) {
        val cars = racers.map { it.run(randomGenerator.getInt(0..9)) }
        raceHistory.push(Round(cars))
    }
}
