package ageofobjetos3

class Guerrero(
  _potencialOfensivo:     Int = 30,
  val potencialDefensivo: Int = 10,
  _energia:               Int = 100) extends Atacable(_energia) with Atacante {

  def potencialOfensivo = _potencialOfensivo
}