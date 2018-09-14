package chois.summer
import CsumAcc.calculate

object summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}
