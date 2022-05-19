package step3.racing

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class RacingTrackTest : DescribeSpec({
  describe("생성") {
    it("생성시 racerCount 만큼 Car 를 생성한다. ") {
      val racers = listOf("a", "b", "c", "d")
      val stubRandomGenerator = StubRandomGenerator()
      val times = 2
      stubRandomGenerator.addResult(listOf(9, 0, 0, 0))
      stubRandomGenerator.addResult(listOf(9, 0, 0, 0))
      val racingTrack = RacingTrack(racers, times, stubRandomGenerator)

      racingTrack.start()

      val allHistory = racingTrack.raceHistory.getAllHistory()
      allHistory.size shouldBe times
      allHistory.forEach { it -> it.cars.forEach { car -> println(car.distance) } }
      allHistory[0].cars[0].distance shouldBe 1
      allHistory[0].cars[1].distance shouldBe 0
      allHistory[0].cars[2].distance shouldBe 0
      allHistory[0].cars[3].distance shouldBe 0
//      allHistory[1] shouldBe Round(listOf(Car("a", 2), Car("b", 0), Car("c", 0), Car("d", 0)))
    }
  }
})
