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

    public abstract void preparar();
    public abstract void assar();
    public abstract void vender();

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
