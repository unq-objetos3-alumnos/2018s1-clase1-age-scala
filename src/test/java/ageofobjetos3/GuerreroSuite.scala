package ageofobjetos3

import org.junit.Assert._
import org.junit.Test

class GuerreroSuite {

  val aquiles = new Guerrero

  @Test
  def unGuerreroAtacaAOtroGuerrero(): Unit = {
    val atila = new Guerrero

    atila.atacarA(aquiles)

    assertEquals(80, aquiles.energia)
  }

  @Test
  def unGuerreroAtacaAMurallas(): Unit = {
    val atila = new Guerrero
    val murallaChina = new Muralla(200)
    atila.atacarA(murallaChina)

    assertEquals(90, murallaChina.energia)
  }

  @Test
  def unEspadachinAtacaAOtroGuerrero(): Unit = {
    val zorro = new Espadachin

    zorro.atacarA(aquiles)

    assertEquals(70, aquiles.energia)
  }

  @Test
  def unMisilAtacaAUnGuerrero(): Unit = {
    val misil = new Misil

    misil.atacarA(aquiles)

    assertEquals(0, aquiles.energia)
  }

  @Test
  def unEspadachinAtacaAOtroGuerreroConOtraEspada(): Unit = {
    val zorro = new Espadachin
    zorro.atacarA(aquiles)
    assertEquals(70, aquiles.energia)

    zorro.espada = new Espada(40)

    zorro.atacarA(aquiles)

    assertEquals(10, aquiles.energia)
  }

  @Test
  def unGuerreroDescansaYRecupera10DeEnergia(): Unit = {
    aquiles.descansar()

    assertEquals(120, aquiles.energia)
  }

  @Test
  def unaMurallaDescansaYRecupera10DeEnergia(): Unit = {
    val muralla = new Muralla(200)

    muralla.descansar()

    assertEquals(120, muralla.energia)
  }

  @Test
  def unGuerreroDescansaYDuplicaSuPotencialOfensivoUnaVez(): Unit = {
    val atila = new Guerrero

    atila.descansar()
    
    assertEquals(60, atila.potencialOfensivo)
    atila.atacarA(aquiles)

    assertEquals(50, aquiles.energia)
    assertEquals(30, atila.potencialOfensivo)
  }
  
  @Test
  def unMisilDescansaYDuplicaSuPotencialOfensivo(): Unit = {
    val misil = new Misil
    val superman = new Guerrero(_energia = 3000)

    misil.descansar()
    
    misil.atacarA(superman)

    assertEquals(1010, superman.energia)
  }
  
  @Test
  def unaFabricaConstruyeUnRobotAtacante: Unit = {
    val fabrica = new Fabrica(2.0f, 40)
    val unRobot = fabrica.crearRobotAtacante()
    
    unRobot.atacarA(aquiles)
    
    assertEquals(30, aquiles.energia)
  }
}