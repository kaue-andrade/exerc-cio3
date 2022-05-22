import java.util.ArrayList;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {

        int contador = 0;
        int preco;
        int mes = 1;
        double somaProduto = 0;

        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> precoMes = new ArrayList<>();

        System.out.println();

        while (contador < 12) {
            System.out.print("Preço do mês " + mes + ": ");
            preco = ler.nextInt();

            precoMes.add(contador, preco);

            somaProduto = somaProduto + preco;

            contador++;
            mes++;
        }

        System.out.println(somaProduto);

        double media = somaProduto / 12;

        System.out.println("\nTodos os preços de cada mês: " + precoMes);
        System.out.println("\nMédia dos preços dos 12 meses do ano: " + media);
    }
}
