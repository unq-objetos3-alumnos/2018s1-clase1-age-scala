package ageofobjetos3

trait Atacante {
  def potencialOfensivo: Int

  def atacarA(objetivo: Atacable) = {
    val diferenciaPotencial =
      this.potencialOfensivo - objetivo.potencialDefensivo

    objetivo.perderEnergia(diferenciaPotencial.max(0))
  }
}