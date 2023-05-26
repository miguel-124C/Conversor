package com.conversor.conversorDeTemperatura;
import com.conversor.conversorDeTemperatura.igu.PantallaConversorTemp;

public class ConversorTemperatura {

    public static void iniciarPantallaConversorDeTemperatura() {
        PantallaConversorTemp princ = new PantallaConversorTemp();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
