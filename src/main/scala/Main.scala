import scala.concurrent.duration._

import Constants._

object TickUntilEnterIsPressed {
  def main(args: Array[String]): Unit = {
    Scala.tickUntilEnterIsPressed(Interval) {
      Terminal.clearCanvas()
      Terminal.goUp(LinesToGoUp)

      TwoDimensionalTime.showCurrent(TimePattern)
    }
  }
}

object TickForFewSeconds {
  def main(args: Array[String]): Unit = {
    Scala.loop(times = FewSeconds) {
      Terminal.clearCanvas()
      Terminal.goUp(LinesToGoUp)

      TwoDimensionalTime.showCurrent(TimePattern)

      Scala.wait(Interval)
    }

    println()
  }
}

object Constants {
  val Interval: FiniteDuration = 1.second
  val LinesToGoUp: Int = Int.MaxValue
  val TimePattern: String = "HH:mm:ss"
  val FewSeconds: Int = 3
}
