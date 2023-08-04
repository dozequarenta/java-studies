package SomaElementosMatriz;

import javax.swing.JOptionPane;

public class SomaElementosMatriz {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int i, j, soma = 0;

        JOptionPane.showMessageDialog(null, "Insira os números inteiros na matriz");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Entre com o número" + "\nlinha" + i + "\ncoluna" + j));
            }
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                soma = soma + matriz[i][j];
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos termos da matriz é: " + soma);
    }
}