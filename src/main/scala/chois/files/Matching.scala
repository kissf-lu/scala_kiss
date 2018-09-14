package chois.files

import java.io.File
class Matching(filesDir: String= ".") {

  private def filesHere : Array[File] = new File(filesDir).listFiles

  private def fileMatching(matcher: String => Boolean) : Array[File] = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }

  def filesEnding(query: String) : Array[File] =
    fileMatching(_.endsWith(query))

  def filesContaining(query: String) : Array[File] =
    fileMatching(_.contains(query))

  def filesRegex(query: String) : Array[File] =
    fileMatching(_.matches(query))
}

object Matching {

  val matchFile: Matching = new Matching

  def fileLines(file: File): List[String] = {
    scala.io.Source.fromFile(file = file).getLines().toList
  }

  def grepLine(files: Array[File], pattern: String): Array[String] = {
    for {
      file <- files
      line <- fileLines(file = file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } yield file + ": " + trimmed
  }
}