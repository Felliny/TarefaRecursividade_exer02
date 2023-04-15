package Controller;

public class MenorValor {

    public MenorValor(){
        super();
    }

    public int vetorMenor(int[] vetor, int tamanho) {
        if (tamanho == 1) { // condição de parada
            return vetor[0];
        } else {
            int menor= vetorMenor(vetor, tamanho - 1); // chamada da recursiva

            if (vetor[tamanho - 1] < menor) {
                return vetor[tamanho - 1];
            }else {
                return menor;
            }

        }
    }

}
