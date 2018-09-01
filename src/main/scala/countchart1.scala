/*
scala io resource
 */

import io.Source


def widthOfLength(s: String) = s.length.toString.length

if (args.length > 0) {
  /*

   */
  val lines = Source.fromFile(args(0)).getLines().toList
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
  val maxWidth = widthOfLength(longestLine)

  for (l <- lines) {
    val numSpace = maxWidth - widthOfLength(l)
    val padding = " " * numSpace
    println(padding + l.length + " | " + l)
  }
}
else
  Console.err.println("please enter filename!")