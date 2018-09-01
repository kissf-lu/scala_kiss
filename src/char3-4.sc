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
