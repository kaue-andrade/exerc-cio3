import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private int aluno;
    private String cpf;
    private String dataNascimento;
    private int validador = 1;
    private int validadorif;
    private int contador = 1;
    private String nota;
    private String temp;

    public void alunoResultado(){

        System.out.println("\n=-=-= Sistema de cadastramento de alunos do IFBA =-=-=");

        Scanner ler = new Scanner(System.in);

        ArrayList<String> AlunoList = new ArrayList<>();

        //System.out.println("\nCPF sem pontos e sem traço!");

        HashMap<String, String> AlunoNome = new HashMap<String, String>();
        HashMap<String, String> AlunoNota = new HashMap<String, String>();

        System.out.println();

        //Não foi possível utilizar o -1 para parar, pois o while dá erro ao tentar implementar.

        System.out.print("Deseja adicionar quantos alunos: ");
        aluno = ler.nextInt();

        System.out.println();

        for (int i=1; i<=aluno; i++){

            System.out.print("Nome do aluno " + i + ": ");
            nome = ler.next();

            System.out.print("CPF do aluno " + i + ": ");
            cpf = ler.next();

            System.out.print("Nota do aluno " + i + ": ");
            nota = ler.next();

            AlunoNome.put(cpf, nome);
            AlunoNota.put(cpf, nota);

            System.out.println();

        }

        System.out.println(AlunoNome);
        System.out.println(AlunoNota);

        System.out.print("\nCPF que deseja consultar: ");
        cpf = ler.next();

        System.out.println("\nNome do aluno com o CPF " + cpf + ": " + AlunoNome.get(cpf));
        System.out.println("\nNota do aluno com o CPF " + cpf + ": " + AlunoNota.get(cpf));

    }
}
