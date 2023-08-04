import java.util.Scanner;

public class Covid {
    public static void main(String[] args) {
        double idade, m_i, boys, girls, pg, pb, t_i;
        int sexo, i;
        boys = 0;
        girls = 0;
        t_i = 0;

        Scanner scan = new Scanner(System.in);
        for (i = 1; i <= 50; i++) {
            System.out.println(
                    "Digite 0 se você se considera do sexo masculino e 1 se você se considera do sexo feminino:");
            sexo = scan.nextInt();
            switch (sexo) {
                case 1:
                    boys = boys + 1;
                    break;

                case 2:
                    girls = girls + 1;
                    break;

                default:
                    System.out.println("O valor inserido está incorreto!");
                    break;
            }
            System.out.println("Digite sua idade:");
            idade = scan.nextDouble();
            t_i = idade + t_i;
        }
        m_i = t_i / 50;
        pg = (girls * 100) / 100;
        pb = (boys * 100) / 100;
        System.out.println("A média das idade é:" + m_i);
        System.out.println("O percentual de pessoas com sexo feminino é:" + pg);
        System.out.println("O percentual de pessoas com sexo masculino é:" + pb);
    }
}