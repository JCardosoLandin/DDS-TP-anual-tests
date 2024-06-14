package org.example.Dominio.Colaboraciones;

import lombok.Getter;
import lombok.Setter;
import org.example.Dominio.Colaboradores.PersonaHumana;
import org.example.Dominio.PersonaVulnerable.PersonaVulnerable;

public class RegistrarPersonasEnSituacionVulnerable implements Colaboracion{
  @Getter
  @Setter
  private PersonaHumana personaHumana;

  public RegistrarPersonasEnSituacionVulnerable(PersonaHumana personaHumana) {
    this.personaHumana = personaHumana;
  }

  @Override
  public void colaborar() {

  }
  public Double calcularPuntos(){return 2.0;}
}
