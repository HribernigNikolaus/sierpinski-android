package net.ladstatt.sierpinski
// TODO
// implement here all domain logic
// Pos / Triangle / Sierpinski

// Program that draws the Sierpinski fractal.

case class Pos(val xCoordinate:Float, val yCoordinate:Float )

case class SColor(val a:Double, val b:Double, val c:Double)
object SColor{
  val White = SColor(1,1,1)
  val Black = SColor(0,0,0)
}

case class Triangle(val a:Pos, val b:Pos, val c:Pos, val color:SColor) {
  def this(a: Pos, abstand: Float) = this(a, Pos(a.xCoordinate + abstand, abstand), Pos(abstand / 2, ((Math.sqrt(3) / 2).toFloat) * abstand))
}

case class Sierpinski(val triangles:List[Triangle]) {

}