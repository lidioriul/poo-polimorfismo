package br.com.estudo.polimorfismo.padaria.comClasses;

import java.math.BigDecimal;

public class PadariaBolo extends Padaria {

    public PadariaBolo(int quantidadeFarinha, int quantidadeLeite, int quantidadeOvo, int minutosParaAssar, BigDecimal valorVenda) {
        super(quantidadeFarinha, quantidadeLeite, quantidadeOvo, minutosParaAssar, valorVenda);
    }

    @Override
    public void preparar() {
        System.out.println(String.format("COLOCAR %d GRAMAS DE FARINHA", getQuantidadeFarinha()));
        System.out.println(String.format("COLOCAR %d MLs DE LEITE", getQuantidadeLeite()));
        System.out.println(String.format("COLOCAR %d OVO(S)", getQuantidadeOvo()));
    }

    @Override
    public void assar() {
        System.out.println(String.format("DEIXAR ASSANDO POR %d MINUTOS", getMinutosParaAssar()));
    }

    @Override
    public void vender() {
        System.out.println(String.format("PREÇO DE VENDA R$%.2f", getValorVenda()));
    }
}
