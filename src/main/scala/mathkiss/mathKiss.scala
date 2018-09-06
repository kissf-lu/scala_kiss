package mathkiss

object mathKiss {
  def main(args: Array[String]): Unit = {
    require(args.length >= 2)
    val rw = new Rational(args(0).toInt, args(1).toInt)
  }
}
