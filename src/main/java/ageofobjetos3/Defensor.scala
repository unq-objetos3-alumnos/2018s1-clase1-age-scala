package ageofobjetos3

trait Defensor {
  
  var energia: Int = 100

  def potencialDefensivo: Int

  def perderEnergia(energiaPerdida: Int) = {
    energia = (energia - energiaPerdida).max(0)
  }
  
  def descansar(): Unit = {
    energia += 20
  }
}