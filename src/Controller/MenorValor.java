package Controller;

public class MenorValor {

    public MenorValor(){
        super();
    }

    public int vetorMenor(int[] vetor, int tamanho) {
        if (tamanho == 1) {
            return vetor[0];
        } else {
            int menor= vetorMenor(vetor, tamanho - 1);

            if (vetor[tamanho - 1] < menor) {
                return vetor[tamanho - 1];
            }else {
                return menor;
            }

        }
    }

}
