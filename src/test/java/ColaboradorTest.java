import org.example.Dominio.Colaboraciones.DonacionDeDinero;
import org.example.Dominio.Colaboradores.PersonaHumana;
import org.example.Dominio.Colaboradores.PersonaJuridica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ColaboradorTest {

    public static PersonaHumana colaboradorHumano;
    public static PersonaJuridica colaboradorJuridico;

    @BeforeEach
    public void setUp() {
        colaboradorHumano = new PersonaHumana();
        colaboradorJuridico = new PersonaJuridica();
    }

    @Test
    public void colaboradorHumano_agregarUnaColaboracion(){
        DonacionDeDinero colaboracionGenerica = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());
        colaboradorHumano.agregarColaboracion(colaboracionGenerica);

        Assertions.assertEquals(1, colaboradorHumano.getColaboraciones().size());
    }

    @Test
    public void colaboradorJuridico_agregarUnaColaboracion(){
        DonacionDeDinero colaboracionGenerica = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());
        colaboradorJuridico.agregarColaboracion(colaboracionGenerica);

        Assertions.assertEquals(1, colaboradorJuridico.getColaboraciones().size());
    }

    @Test
    public void colaboradorHumano_realizarVariasColaboraciones(){
        DonacionDeDinero colaboracionGenerica1 = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());        DonacionDeDinero colaboracionGenerica = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());
        DonacionDeDinero colaboracionGenerica2 = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());
        DonacionDeDinero colaboracionGenerica3 = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());
        DonacionDeDinero colaboracionGenerica4 = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());

        colaboradorHumano.agregarColaboracion(colaboracionGenerica1);
        colaboradorHumano.agregarColaboracion(colaboracionGenerica2);
        colaboradorHumano.agregarColaboracion(colaboracionGenerica3);
        colaboradorHumano.agregarColaboracion(colaboracionGenerica4);

        Assertions.assertEquals(4, colaboradorHumano.getColaboraciones().size());
    }

    @Test
    public void colaborador_calcularPuntos(){
        DonacionDeDinero colaboracionGenerica1 = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());
        DonacionDeDinero colaboracionGenerica2 = new DonacionDeDinero(LocalDate.now(), 500.0, LocalDate.now());

        colaboradorHumano.agregarColaboracion(colaboracionGenerica1);
        colaboradorHumano.agregarColaboracion(colaboracionGenerica2);

        Assertions.assertEquals(500.0, colaboradorHumano.calcularPuntos());
    }

}
