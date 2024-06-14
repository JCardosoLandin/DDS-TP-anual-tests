package org.example.Dominio.Tarjetas;

import lombok.Getter;
import org.example.Dominio.Heladeras.Heladera;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private String codigo;
    @Getter
    private List<UsoTarjeta> usos = new ArrayList<UsoTarjeta>();

    public void usar(Heladera unaHeladera, int menoresACargo) {
        if (this.validarUso(menoresACargo)) {
            UsoTarjeta nuevoUso = new UsoTarjeta(LocalDate.now(), LocalTime.now(), unaHeladera);
            usos.add(nuevoUso);
        } else {
            System.out.println("Limite de usos diarios alcanzado para la tarjeta: " + codigo);
        }
    }

    private boolean validarUso(int menoresACargo){
        List<UsoTarjeta> usosHoy = this.usosDe(LocalDate.now());
        return usosHoy.size() < 4 + 2*menoresACargo;
    }

    private List<UsoTarjeta> usosDe(LocalDate unaFecha){
        return usos.stream().filter(c -> c.getFecha().isEqual(unaFecha)).toList();
    }
}
