package ageofobjetos3

class Muralla(añosDeAntigüedad: Int) extends Defensor {
  def potencialDefensivo = 40 - añosDeAntigüedad / 10
}