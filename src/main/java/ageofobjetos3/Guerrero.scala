package ageofobjetos3

class Guerrero(
  _potencialOfensivo:     Int = 30,
  val potencialDefensivo: Int = 10,
  _energia:               Int = 100) extends Defensor with Atacante {
  
  override def descansar(): Unit = {
    super[Atacante].descansar()
    super[Defensor].descansar()
  }
  
  this.energia = _energia

  protected def potencialOfensivoBase = _potencialOfensivo
}