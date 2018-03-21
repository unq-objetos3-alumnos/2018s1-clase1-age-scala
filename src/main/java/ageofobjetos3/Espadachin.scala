package ageofobjetos3

class Espada(val potencialOfensivo: Int)

class Espadachin(
  var espada:           Espada = new Espada(10),
  unPotencialOfensivo:  Int    = 30,
  unPotencialDefensivo: Int    = 10,
  unaEnergia:           Int    = 100)
  extends Guerrero(unPotencialOfensivo, unPotencialDefensivo, unaEnergia) {

  override def potencialOfensivoBase = unPotencialOfensivo + espada.potencialOfensivo 
}