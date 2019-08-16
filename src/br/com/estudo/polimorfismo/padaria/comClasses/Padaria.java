package br.com.estudo.polimorfismo.padaria.comClasses;

import java.math.BigDecimal;

public abstract class Padaria {

    private int quantidadeFarinha;
    private int quantidadeLeite;
    private int quantidadeOvo;
    private int minutosParaAssar;
    private BigDecimal valorVenda;

    public Padaria(){}

    public Padaria(int quantidadeFarinha, int quantidadeLeite, int quantidadeOvo, int minutosParaAssar, BigDecimal valorVenda) {
        this.quantidadeFarinha = quantidadeFarinha;
        this.quantidadeLeite = quantidadeLeite;
        this.quantidadeOvo = quantidadeOvo;
        this.minutosParaAssar = minutosParaAssar;
        this.valorVenda = valorVenda;
    }

    public void preparar() {
        System.out.println(String.format("COLOCAR %d GRAMAS DE FARINHA", getQuantidadeFarinha()));
        System.out.println(String.format("COLOCAR %d MLs DE LEITE", getQuantidadeLeite()));
        System.out.println(String.format("COLOCAR %d OVO(S)", getQuantidadeOvo()));
    }
    public void assar() {
        System.out.println(String.format("DEIXAR ASSANDO POR %d MINUTOS", getMinutosParaAssar()));
    }
    public void vender() {
        System.out.println(String.format("PREÇO DE VENDA R$%.2f", getValorVenda()));
    }

    public int getQuantidadeFarinha() {
        return quantidadeFarinha;
    }

    public int getQuantidadeLeite() {
        return quantidadeLeite;
    }

    public int getQuantidadeOvo() {
        return quantidadeOvo;
    }

    public int getMinutosParaAssar() {
        return minutosParaAssar;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }
}
