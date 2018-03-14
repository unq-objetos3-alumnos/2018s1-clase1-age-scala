package ageofobjetos3

class Muralla(añosDeAntigüedad: Int) extends Atacable {
  def potencialDefensivo = 40 - añosDeAntigüedad / 10
}