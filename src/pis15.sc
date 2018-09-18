
/*
样例类和模式匹配章节练习

1. 由case修饰的类为样例(case class)
 */

abstract class Expr
case class Number(num: Double) extends Expr
case class Var(name: String) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

//val tt = UnOp("-", Number(1))

def simplifyTop(expr: Expr): Expr = expr match {
  case UnOp("-", UnOp("-", e)) => e
  case BinOp("+", e, Number(0)) => e
  case BinOp("*", e, Number(1)) => e
  case _ => expr
}

val m1 = BinOp("+", Number(0), Number(0))

def arrayMatch(a: List[Int]) = a match {
  case List(0, e @ 2, _*) => e
  case _ => 0
}

arrayMatch(List(0, 2))

def isort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y :: ys => insert(y, isort(ys))
}


def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => x :: xs
  case y :: ys =>
    if (x <= y) x :: xs
    else y :: insert(x, ys)
}

val ls1 = List(List(2), List(3), List(5))
ls1.flatten.toArray

