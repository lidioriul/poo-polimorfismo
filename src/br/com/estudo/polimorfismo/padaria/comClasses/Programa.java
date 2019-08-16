package br.com.estudo.polimorfismo.padaria.comClasses;

import java.math.BigDecimal;

public class Programa {

    public static void main(String[] args) {
        Padaria prodPadaria = new PadariaPao(250, 250, 3, 30, BigDecimal.valueOf(1L));
        System.out.println("PÃO");
        prodPadaria.preparar();
        prodPadaria.assar();
        prodPadaria.vender();

        prodPadaria = new PadariaBolo(500, 300, 6, 40, BigDecimal.valueOf(12L));
        System.out.println("\nBOLO");
        prodPadaria.preparar();
        prodPadaria.assar();
        prodPadaria.vender();

        prodPadaria = new PadariaMistoQuente();
        System.out.println("\nMISTO QUENTE");
        prodPadaria.preparar();
        prodPadaria.assar();
        prodPadaria.vender();
    }

}
