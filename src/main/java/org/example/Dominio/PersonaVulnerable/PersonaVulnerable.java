package org.example.Dominio.PersonaVulnerable;

import lombok.Setter;
import org.example.Dominio.Documentos.Documento;
import org.example.Dominio.Heladeras.Heladera;
import org.example.Dominio.Tarjetas.Tarjeta;

import java.time.LocalDate;

public class PersonaVulnerable {

    private String nombre;
    private LocalDate fechaDeNacimiento;
    private LocalDate fechaDeRegristro;
    private String domicilio;

    // Esto podria implementarse asi
    // private List<PersonaVulnerable> menoresACargo;

    @Setter
    private int menoresACargo;
    private Documento documento;
    @Setter
    private Tarjeta tarjeta;

    public void usarTarjeta(Heladera unaHeladera){
        tarjeta.usar(unaHeladera, menoresACargo);
    }
}
