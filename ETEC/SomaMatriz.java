package SomaMatriz;

import javax.swing.JOptionPane;

public class SomaMatriz {
    public static void main (String[] args) {
        double matriz_a[][] = new double [4][4];
        double matriz_b[][] = new double [4][4];
        double matriz_c[][] = new double [4][4];
        int i, j;
        String exibir = "";

        JOptionPane.showMessageDialog(null, "Insira os valores na matriz A");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz_a[i][j] = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Entre com o número" + "\nlinha" + i + "\ncoluna" + j)
                );
            }
        }

        JOptionPane.showMessageDialog(null, "Insira os valores na matriz B");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz_b[i][j] = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Entre com o número" + "\nlinha" + i + "\ncoluna" + j)
                );
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz_c[i][j] = matriz_a[i][j] + matriz_b[i][j];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Exibindo matriz C = A + B");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                exibir += matriz_c[i][j] + "|";
            }
            exibir += "\n";
        }
        JOptionPane.showMessageDialog(null, exibir);
    }
}
