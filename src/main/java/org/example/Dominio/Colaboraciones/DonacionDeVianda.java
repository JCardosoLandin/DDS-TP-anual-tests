package org.example.Dominio.Colaboraciones;

import org.example.Dominio.Viandas.Vianda;

import java.util.List;

public class DonacionDeVianda implements Colaboracion{
  private List<Vianda> viandas; //TODO: Agregar las viandas

  public DonacionDeVianda(List<Vianda> listaViandas) {
    this.viandas = listaViandas;
  }

  public DonacionDeVianda(){}

  @Override
  public void colaborar() {

  }
  public Double calcularPuntos(){return viandas.size() *1.5;}
}
