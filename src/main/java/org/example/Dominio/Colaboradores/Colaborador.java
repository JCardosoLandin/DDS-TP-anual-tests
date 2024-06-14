package org.example.Dominio.Colaboradores;

import lombok.Getter;
import lombok.Setter;
import org.example.Dominio.Colaboraciones.Colaboracion;
import org.example.Dominio.MediosContacto.MedioDeContacto;

import java.util.ArrayList;
import java.util.List;

public abstract class Colaborador {
  @Getter
  private List<Colaboracion> colaboraciones;
  @Getter
  @Setter
  private List<MedioDeContacto> mediosDeContacto;
  @Getter
  @Setter
  private String direccion;

  @Getter
  @Setter
  private Double puntos;


  public Colaborador() {
    colaboraciones = new ArrayList<>();
  }

  public void agregarColaboracion(Colaboracion colaboracion){
    colaboraciones.add(colaboracion);
    this.realizarColaboracion(colaboracion);
  }

  public void realizarColaboracion(Colaboracion colaboracion){
    colaboracion.colaborar();
  }

  public Double calcularPuntos(){
    return colaboraciones.stream().mapToDouble(Colaboracion::calcularPuntos).sum();
  }
}
