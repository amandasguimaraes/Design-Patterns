package br.inatel;

public class Main {
    public static void main(String[] args) {

        Frases observavel = new Frases();

        NumeroPalavras observador1 = new NumeroPalavras();
        NumeroPalavrasMaiusculas observador2 = new NumeroPalavrasMaiusculas();
        NumeroPalavrasPares observador3 = new NumeroPalavrasPares();

        observavel.registraObservador(observador1);
        observavel.registraObservador(observador2);
        observavel.registraObservador(observador3);

        observavel.notificaObservadores("O Flamengo é o maior clube do Brasil!");

    }
}