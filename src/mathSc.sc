/*

 */

import chois.files.Matching
import chois.math.Rational
/*
Rational class test
 **********************************************/
val x = new Rational(39, 57)
val y = new Rational(10, 25)

x > y

/*
file to dir
 */
val dirFiles: String =
  "D:\\Git\\scala\\hello\\src\\main\\scala\\chois\\math"

/*
行列表生成函数

 **********************************************/
def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield{
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }
// 行转字符串
def makeRow(row: Int): String = makeRowSeq(row= row).mkString

def multiTable(): String = {
  val tableSeq = // 行字符串序列
  for (row <- 1 to 10)
    yield makeRow(row=row)
  // string return
  tableSeq.mkString("\n")
}

multiTable()

/*
closure func test
 **************************************************************/
def closureIncr(more: Int) = (x: Int) => x + more

val cic = closureIncr(10)
cic(8)
val cic1 = closureIncr(100)
cic1(8)

/*
args func
 ***************************************************/
def echo(args: String*): Unit =
  for (arg <- args) println(arg)

val echoList = List("chois", "lu")

echo(echoList: _*)

/*
files packs test
 *************************************************/
val mm = new Matching(filesDir= dirFiles)
val gerp = Matching.grepLine(
  files = mm.filesEnding(query= ".scala"),
  pattern = ".*abs.*")

/*
currying func
 */
def currySum(x: Int)(y: Int) = x + y

val onePlus = currySum(1) _
onePlus(2)

def oneth(op: Double => Double, x: Double) = op(x)

oneth(_ + 2, 2).toString



