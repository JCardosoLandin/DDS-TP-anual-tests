import org.example.Dominio.Heladeras.Heladera;
import org.example.Dominio.PersonaVulnerable.PersonaVulnerable;
import org.example.Dominio.Tarjetas.Tarjeta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TarjetaTest {

    PersonaVulnerable personaVulnerable;
    Heladera heladera;
    Tarjeta tarjeta;

    @BeforeEach
    public void setUp() {
        personaVulnerable = new PersonaVulnerable();

        tarjeta = new Tarjeta();

        personaVulnerable.setTarjeta(tarjeta);

        heladera = new Heladera();
    }

    @Test
    public void tarjeta_personaVulnerableUsaTarjeta() {
        personaVulnerable.usarTarjeta(heladera);

        Assertions.assertEquals(1, tarjeta.getUsos().size());
    }

    @Test
    public void tarjeta_LimitesDiariosAlcanzados() {
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);

        // El 5to no tendria que pasar
        Assertions.assertEquals(4, tarjeta.getUsos().size());
    }

    @Test
    public void tarjeta_LimitesDiariosMayoresA4PorMenorACargo(){
        personaVulnerable.setMenoresACargo(1);

        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);
        personaVulnerable.usarTarjeta(heladera);

        Assertions.assertEquals(6, tarjeta.getUsos().size());
    }
}
