import java.util.HashSet;
import java.util.Scanner;

public class Marcas {

    private int contador = 0;
    private String marca;
    private int numMarca = 1;

    public void marcasResultado() {

        System.out.println("\nUtilizando HashSet não há repitação de elementos e os elementos não precisam necessariamente estar em uma ordem.");

        Scanner ler = new Scanner(System.in);

        HashSet<String> marcaSet = new HashSet<String>();

        System.out.println();

        while (contador < 10) {
            System.out.print("Marca " + numMarca + ": ");
            marca = ler.next();

            marcaSet.add(marca);

            contador++;
            numMarca++;
        }

        System.out.println("\nTodas as marcas: " + marcaSet);

    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumMarca() {
        return numMarca;
    }

    public void setNumMarca(int numMarca) {
        this.numMarca = numMarca;
    }
}
