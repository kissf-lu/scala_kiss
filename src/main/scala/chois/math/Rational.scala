package chois.math

/*
Extends Ordered Class
 */
class Rational(n: Int, d: Int) extends Ordered[Rational]{
  require(d != 0)
  private val g = {
    gcb(a = n.abs, b = d.abs)
  }
  val mol: Int = n / g
  val den: Int = d / g
  def this(n: Int) = this(n, 1)  // auxiliary constructor

  def + (that: Rational): Rational ={
    new Rational(
      mol * that.den + den * that.mol,
      den * that.den
    )
  }

  def + (i: Int): Rational = {
    new Rational(mol + den * i, den)
  }

  def - (that: Rational): Rational ={
    new Rational(
      mol * that.den - den * that.mol,
      den * that.den
    )
  }
  def - (i: Int): Rational = {
    new Rational(mol - den * i, den)
  }

  def * (that: Rational): Rational = {
    new Rational(mol * that.mol, den * that.den)
  }
  def * (i: Int): Rational = {
    new Rational(mol * i, den)
  }

  def / (that: Rational): Rational = {
    new Rational(mol * that.den, den * that.mol)
  }
  def / (i: Int): Rational = {
    new Rational(mol, den * i)
  }
// class Ordered
  override def compare(that: Rational): Int =
    (this.mol * that.den) - (this.den * that.mol)

  override def toString: String = mol + "/" + den

  private def gcb(a: Int, b: Int): Int = {
    if (b == 0) a else gcb(b, a % b)  // Maximum common divisor
  }
}

