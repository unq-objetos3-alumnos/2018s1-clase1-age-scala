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
}