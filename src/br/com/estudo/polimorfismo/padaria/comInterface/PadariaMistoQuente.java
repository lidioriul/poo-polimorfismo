package br.com.estudo.polimorfismo.padaria.comInterface;

public class PadariaMistoQuente implements Padaria {

    @Override
    public void preparar() {
        System.out.println(String.format("COLOCAR 2 FATIAS DE PÃO DE FORMA"));
        System.out.println(String.format("COLOCAR %d FATIAS DE PRESUNTO", 4));
        System.out.println(String.format("COLOCAR %d FATIAS DE QUEIJO", 4));
    }

    @Override
    public void assar() {
        System.out.println(String.format("COLOCAR NA CHAPA ATÉ OS INGREDIENTES ESQUENTAR"));
    }

    @Override
    public void vender() {
        System.out.println(String.format("PREÇO DE VENDS R$4,50"));
    }
}
