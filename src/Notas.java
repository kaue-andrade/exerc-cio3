import java.util.HashMap;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        int contador = 1;
        String cpf = "76460520356";
        double nota = 0;

        System.out.println("\nCPF sem pontos e sem traço!");

        Scanner ler = new Scanner(System.in);

        HashMap<String, Double> notasCPF = new HashMap<String, Double>();

        System.out.println();

        for (int i=1; i<=50; i++){

            System.out.print("CPF do aluno " + i + ": ");
            cpf = ler.next();

            System.out.print("Nota do aluno " + i + ": ");
            nota = ler.nextDouble();

            notasCPF.put(cpf, nota);

            System.out.println();

        }

        System.out.println(notasCPF);

        System.out.println("\nNota do aluno com o CPF 764.605.203-56: " + notasCPF.get(cpf));

    }
}
