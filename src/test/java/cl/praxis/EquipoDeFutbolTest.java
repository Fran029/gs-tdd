package cl.praxis;

import modelos.EquipoDeFutbol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquipoDeFutbolTest {


  private   static final int CUATRO_JUEGOS_GANADOS=4;
    @Test
    public void constructorDebeSetearJuegosGanados(){
        EquipoDeFutbol equipo= new EquipoDeFutbol(CUATRO_JUEGOS_GANADOS);
        assertEquals(CUATRO_JUEGOS_GANADOS,equipo.getJuegosGanados());
    }
}
