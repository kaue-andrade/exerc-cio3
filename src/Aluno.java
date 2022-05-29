import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String validador = "teste";
    private int contador = 1;

    public void alunoResultado(){

        System.out.println("\n=-=-= Sistema de cadastramento de alunos do IFBA =-=-=");

        Scanner ler = new Scanner(System.in);

        ArrayList<String> AlunoList = new ArrayList<>();

        System.out.println();

        System.out.println("\nCPF sem pontos e sem traço!");

        HashMap<String, Double> AlunoMap = new HashMap<String, Double>();

        System.out.println();

        while (verificador != ){

            System.out.print("Digite o nome do aluno " + contador + ": ");
            nome = ler.next();

            System.out.print("CPF do aluno " + i + ": ");
            cpf = ler.next();

            System.out.print("Nota do aluno " + i + ": ");
            nota = ler.nextDouble();

            AlunoMap.put(cpf, nota);

            System.out.println();

        }

        System.out.println(CPFnotas);

        cpf = "76460520356";

        System.out.println("\nNota do aluno com o CPF 764.605.203-56: " + CPFnotas.get(cpf));

    }

        for (String i = "teste"; i != "-1"; ) {

            System.out.print("Digite o nome do aluno " + contador + ": ");
            nome = ler.next();

            if (nome != "-1") {
                break;
            } else {
                Aluno.add(nome);
            }

            i = nome;
            contador++;
        }
    }
}
