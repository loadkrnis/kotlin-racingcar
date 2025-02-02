package step3.racing

class RacingTrack(racerCount: Long, val times: Long) {
  val racers: List<Car> = buildList {
    repeat(racerCount.toInt()) { add(Car()) }
  }

  private fun nextTime() = println()
  fun start() = repeat(times.toInt()) {
    racers.forEach {
      it.run()
    }
    nextTime()
  }
}
