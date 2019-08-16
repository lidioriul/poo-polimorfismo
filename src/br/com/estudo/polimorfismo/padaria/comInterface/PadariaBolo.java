package br.com.estudo.polimorfismo.padaria.comInterface;

import java.math.BigDecimal;

public class PadariaBolo implements Padaria {

    private final int quantidadeFarinha;
    private final int quantidadeLeite;
    private final int quantidadeOvo;
    private final int minutosParaAssar;
    private final BigDecimal valorVenda;

    public PadariaBolo(int quantidadeFarinha, int quantidadeLeite, int quantidadeOvo, int minutosParaAssar, BigDecimal valorVenda) {
        this.quantidadeFarinha = quantidadeFarinha;
        this.quantidadeLeite = quantidadeLeite;
        this.quantidadeOvo = quantidadeOvo;
        this.minutosParaAssar = minutosParaAssar;
        this.valorVenda = valorVenda;
    }

    @Override
    public void preparar() {
        System.out.println(String.format("COLOCAR %d GRAMAS DE FARINHA", this.quantidadeFarinha));
        System.out.println(String.format("COLOCAR %d MLs DE LEITE", this.quantidadeLeite));
        System.out.println(String.format("COLOCAR %d OVO(S)", this.quantidadeOvo));
    }

    @Override
    public void assar() {
        System.out.println(String.format("DEIXAR ASSANDO POR %d MINUTOS", this.minutosParaAssar));
    }

    @Override
    public void vender() {
        System.out.println(String.format("PREÇO DE VENDA R$%.2f", this.valorVenda));
    }
}
