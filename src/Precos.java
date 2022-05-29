import java.util.ArrayList;
import java.util.Scanner;

public class Precos {

    private int contador = 0;
    private double preco;
    private int mes = 1;
    private double somaProduto = 0;

    public void precosResultado() {

        Scanner ler = new Scanner(System.in);

        ArrayList<Double> precoMes = new ArrayList<>();

        System.out.println();

        while (contador < 12) {
            System.out.print("Preço do mês " + mes + ": ");
            preco = ler.nextDouble();

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

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getSomaProduto() {
        return somaProduto;
    }

    public void setSomaProduto(double somaProduto) {
        this.somaProduto = somaProduto;
    }
}
