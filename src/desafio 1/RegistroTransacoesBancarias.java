import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        // Lê a Entrada que informa o saldo inicial da conta
        double saldo = sc.nextDouble();

        // Lê a Entrada com a quantidade total de transações
        int quantidadeTransacoes = sc.nextInt();

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = sc.next().toUpperCase().charAt(0);
            double valorTransacao = sc.nextDouble();

            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; 
            }
        }

        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes: ");
        for(int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }

        sc.close();
    }
}