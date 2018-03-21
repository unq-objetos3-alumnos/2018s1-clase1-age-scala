package ageofobjetos3

trait Atacante {

  trait EstadoDescanso {
    def potencialOfensivo(atacante: Atacante): Int
  }

  object EstadoDescanso {
    object Descansado extends EstadoDescanso {
      def potencialOfensivo(atacante: Atacante): Int = {
        return atacante.potencialOfensivoBase * 2
      }
    }

    object Normal extends EstadoDescanso {
      def potencialOfensivo(atacante: Atacante): Int = {
        return atacante.potencialOfensivoBase
      }
    }
  }

  var estadoDescanso: EstadoDescanso = EstadoDescanso.Normal

  protected def potencialOfensivoBase: Int

  def descansar(): Unit = {
    estadoDescanso = EstadoDescanso.Descansado
  }

  def potencialOfensivo: Int =
    estadoDescanso.potencialOfensivo(this)

  def atacarA(objetivo: Defensor) = {
    val diferenciaPotencial =
      this.potencialOfensivo - objetivo.potencialDefensivo

    objetivo.perderEnergia(diferenciaPotencial.max(0))
    estadoDescanso = EstadoDescanso.Normal
  }
}