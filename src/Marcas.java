import java.util.HashSet;
import java.util.Scanner;

public class Marcas {
    public static void main(String[] args) {

        System.out.println("\nUtilizando HashSet não há repitação de elementos e os elementos não precisam necessariamente estare em uma ordem.");

        int contador = 0;
        String marca;
        int numMarca = 1;

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
}
