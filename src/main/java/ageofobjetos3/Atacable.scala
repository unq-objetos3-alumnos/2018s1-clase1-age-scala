package ageofobjetos3

abstract class Atacable(var energia: Int = 100) {

  def potencialDefensivo: Int

  def perderEnergia(energiaPerdida: Int) = {
    energia = (energia - energiaPerdida).max(0)
  }
}