/*

 */
def max_simple(x: Int, y: Int): Int = if (x > y) x else y

max_simple(8, 10)


val greetStrings: Array[String] = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

greetStrings.update(0, "hello")

for (i <- 0 to 2) {
    print(greetStrings(i))
}


val oneTowThree = 1 :: 2 :: 3 :: Nil

val reverse_ntt = oneTowThree.reverse

reverse_ntt.length

val charList: List[String] = List("chois", "kissf", "lujian")
charList.length
charList.sortWith(_.compareTo(_) < 0)

def sumArgs(args: Int*): Int = {
    var res: Int = 0
    for (arg <- args) res += arg
    res
}

var pair = (99, "ok")
pair._1
pair._2

val s = 'Symbol

val fool = false

val msg = f"the msg is ${math.Pi}%.5f"
