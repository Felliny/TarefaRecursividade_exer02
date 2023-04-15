package View;

import Controller.MenorValor;

public class Main {
    public static void main(String[] args) {
        int vetor[] = {1, 11 , -3, 11, 0};
        int tamanho= vetor.length;
        MenorValor op= new MenorValor();
        System.out.println("Menor valor: "+ op.vetorMenor(vetor, tamanho));
    }
}
