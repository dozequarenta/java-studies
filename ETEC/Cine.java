import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        String opinion;
        double media, porcent;
        int idade, cont_id, soma_id, cont_op, cont_pe, i;
        cont_op = 0;
        soma_id = 0;
        cont_id = 0;
        cont_pe = 0;
        i = 1;

        Scanner scan = new Scanner(System.in);

        while (i <= 40) {
            i++;
            System.out.println("Digite sua idade");
            idade = scan.nextInt();
            System.out.println("Digite sua opinião: A-ótimo, B-bom, C-regular, D-ruim, E-péssimo");
            opinion = scan.nextLine();

            switch (opinion) {
                case "A":
                    cont_op = cont_op + 1;
                    break;

                case "D":
                    soma_id = soma_id + idade;
                    cont_id = cont_id + 1;
                    break;

                case "E":
                    cont_pe = cont_pe + 1;
                    break;
            }
        }

        media = soma_id / cont_id;
        porcent = (cont_pe * 100);

        System.out.println("A quantidade de respostas ótimo:" + cont_op);
        System.out.println("A média de idade das pessoas que responderam ruim:" + media);
        System.out.println("A porcentagem de respostas péssimo:" + porcent);
    }
}
