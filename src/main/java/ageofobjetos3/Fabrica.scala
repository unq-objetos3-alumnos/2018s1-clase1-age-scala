package ageofobjetos3

class Robot(val potenciaEnWatts: Int)

class Fabrica(estandarCalidad: Double, potenciaEnWattsFabrica: Int) {
  def crearRobotAtacante() = {
    new Robot(potenciaEnWattsFabrica) with Atacante {
      def potencialOfensivoBase = 
        (estandarCalidad * potenciaEnWatts).toInt
    }
  }
}