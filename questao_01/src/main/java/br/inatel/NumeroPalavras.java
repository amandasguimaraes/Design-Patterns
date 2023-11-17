package br.inatel;

public class NumeroPalavras implements iObservador {

    private int numPalavras;

    @Override
    public void update(String palavra) {
        numPalavras++;
    }

    @Override
    public int getNumPalavras() {
        System.out.println("Numero de Palavras: " + numPalavras);
        return numPalavras;
    }

}
