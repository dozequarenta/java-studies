import javax.swing.JOptionPane;

public class ControleIPVA {
    public static void main(String[] args) {

        int final_placa;

        final_placa = Integer.parseInt(JOptionPane.showInputDialog("Digite o último número da placa do veículo: "));

        switch (final_placa) {
            case 1:
                JOptionPane.showMessageDialog(null, "Pagamento até 30/04");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/05");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Pagamento até 30/06");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/07");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/08");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Pagamento até 30/09");
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/10");
                break;

            case 8:
                JOptionPane.showMessageDialog(null, "Pagamento até 30/11");
                break;

            case 9:
                JOptionPane.showMessageDialog(null, "Pagamento até 31/12");
                break;

            case 0:
                JOptionPane.showMessageDialog(null, "OPagamento até 31/12");
                break;

            default:
                JOptionPane.showMessageDialog(null, "O valor inserido está incorreto!");
                break;
        }
    }
}
