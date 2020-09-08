package fiado;

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        Consumidor consumidor = new Consumidor(nome);

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        consumidor.setTelefone(telefone);
        
        System.out.print("Valor da compra: ");
        int fiado = Integer.valueOf(scanner.nextLine());
        consumidor.registrarFiado(fiado);

        int total = consumidor.getFiado();

        if (total > 100) {
            System.out.print("Cliente " + consumidor.getNome() + " deve: " + total );
        } else {
            System.out.print("Cliente " + consumidor.getNome() + " deve: " + total );
        }



    }
    
}
