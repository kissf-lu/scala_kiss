/*

 */

import mathkiss.Rational
val x = new Rational(39, 57)
val y = new Rational(10, 25)

val dirFiles = "D:\\Git\\scala\\hello\\src\\main\\scala\\mathkiss"
val fileHere = new java.io.File(dirFiles)

def fileLines(file: java.io.File): List[String] = {
  scala.io.Source.fromFile(file = file).getLines().toList
}

def grepLine(pattern: String): Unit ={
  for {
    file <- fileHere.listFiles()
    if file.getName.endsWith(".scala")
    line <- fileLines(file = file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  }println(file + ": " + trimmed)
}

grepLine(pattern = ".*gcb.*")

