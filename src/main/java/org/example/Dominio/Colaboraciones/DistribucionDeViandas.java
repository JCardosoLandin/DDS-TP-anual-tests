package org.example.Dominio.Colaboraciones;

import lombok.Getter;
import lombok.Setter;
import org.example.Dominio.Heladeras.Heladera;

import java.time.LocalDate;

public class DistribucionDeViandas implements Colaboracion{
  @Getter
  @Setter
  private Heladera heladeraOrigen;
  @Getter
  @Setter
  private Heladera heladeraDestino;
  @Getter
  @Setter
  private String motivo;
  @Getter
  @Setter
  private LocalDate fecha;


  public DistribucionDeViandas(Heladera heladeraOrigen, Heladera heladeraDestino, String motivo, LocalDate fecha) {
    this.heladeraOrigen = heladeraOrigen;
    this.heladeraDestino = heladeraDestino;
    this.motivo = motivo;
    this.fecha = fecha;
  }

  public DistribucionDeViandas(){}

  @Override
  public void colaborar() {

  }

  public Double calcularPuntos(){return 1.0;}
}
