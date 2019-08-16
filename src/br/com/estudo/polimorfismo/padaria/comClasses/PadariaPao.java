package br.com.estudo.polimorfismo.padaria.comClasses;

import java.math.BigDecimal;

public class PadariaPao extends Padaria {

    public PadariaPao(int quantidadeFarinha, int quantidadeLeite, int quantidadeOvo, int minutosParaAssar, BigDecimal valorVenda) {
        super(quantidadeFarinha, quantidadeLeite, quantidadeOvo, minutosParaAssar, valorVenda);
    }
}
