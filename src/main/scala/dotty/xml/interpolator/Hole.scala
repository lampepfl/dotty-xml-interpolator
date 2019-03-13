package dotty.xml.interpolator

import scala.language.implicitConversions

object Hole {
  val HoleStart = 0xE000.toChar.toString
  val HoleChar  = 0xE001.toChar.toString
  
  def encode(i: Int) = HoleStart + HoleChar * i
}