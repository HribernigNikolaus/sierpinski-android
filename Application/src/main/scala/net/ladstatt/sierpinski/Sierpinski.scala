package net.ladstatt.sierpinski
// TODO
// implement here all domain logic
// Pos / Triangle / Sierpinski

// Program that draws the Sierpinski fractal.

public class Pos(val pos:Float, val length:Float ) {


}

public class sColor(val a:Float, val b:Float, val c:Float){

}

public class Triangle(val punktA:Pos, val punktB:Pos, val punktC:Pos, val color:SColor){
  def this(val punkt:Pos, val color:Float) = this()

  def this(val punkt:Pos, val color:Int) = this()

  def this(val punkt:Post, val color:SColor) = this()
}
