def squ(x: Int): Int={
  x*  x
}

case class Point(x: Int, y: Int)

val point = Point(1, 2)

val anotherPoint = Point(1, 3)

if (point == anotherPoint){
  println("equal!")
} else {
  println("not equal!")
}
