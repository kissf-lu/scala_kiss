/*

 */

import  scala.collection.mutable

val mixMap = mutable.Map[String, String]()

mixMap += ("a" -> "Go")
mixMap += ("b" -> "Find")
mixMap += ("c" -> "Dig")
mixMap.update("a", "kissf")
mixMap.keys

val strArray = Array("chois", "kissf", "lujian")

def formatArgs(args: Array[String]): String= args.mkString("\n")

println(formatArgs(strArray))


def sumByteChar(args: String): Int = {
  var _sum = 0
  args.foreach(arg => _sum +=arg.toByte)
  _sum
}

def checkSumChart(valsum: Int): Int = ~(valsum & 0xFF) - 1

val cache  = mutable.Map.empty[String, Int]
val mapKye = "chois"
cache.update(mapKye, checkSumChart(sumByteChar(args = mapKye)))

assert(mapKye == "chois")

val litter =
  """
    |ok " \ *
    |you are
    |ok
  """.stripMargin

~7 + 1