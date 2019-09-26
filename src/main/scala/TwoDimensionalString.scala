final case class TwoDimensionalString(
    top: String,
    middle: String,
    bottom: String
) {
  require(
    requirement = doAllRowsHaveSameLength,
    message = "All rows must have the same length!"
  )

  private[this] def doAllRowsHaveSameLength: Boolean =
    top.length == middle.length && middle.length == bottom.length

  def +(that: TwoDimensionalString): TwoDimensionalString =
    TwoDimensionalString( // format: off
      top    = this.top    + that.top,
      middle = this.middle + that.middle,
      bottom = this.bottom + that.bottom
    ) // format: on

  def show(): Unit = {
    println(rendered)
  }

  private[this] def rendered: String = // format: off
    top    + "\n" +
    middle + "\n" +
    bottom // format: on
}

object TwoDimensionalString {
  val QuestionMarks: TwoDimensionalString =
    TwoDimensionalString( // format: off
      top    = "   ",
      middle = " ? ",
      bottom = " ? "
    ) // format: on

  val Empty: TwoDimensionalString =
    TwoDimensionalString( // format: off
      top    = "",
      middle = "",
      bottom = ""
    ) // format: on
}
