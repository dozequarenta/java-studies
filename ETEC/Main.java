import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String modelo;
    int diaria;
    int dias;
    double km;
    double valor;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o modelo do carro alugado");
    modelo = leitor.next();

    System.out.println("Insira o valor da diária");
    diaria = leitor.nextInt();

    System.out.println("Insira a quantidade de dias da locação");
    dias = leitor.nextInt();

    System.out.println("Insira a quantidade de kilômetro rodado");
    km = leitor.nextInt();

    valor = km * 0.20 + dias * diaria;

    System.out.println("O aluguel do veículo" + modelo + "ficou por" + valor);
  }
}