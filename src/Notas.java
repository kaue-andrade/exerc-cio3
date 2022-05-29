import java.util.HashMap;
import java.util.Scanner;

public class Notas {

    private int contador = 1;
    private String cpf;
    private double nota = 0;

    public void notaAluno() {

        System.out.println("\nCPF sem pontos e sem traço!");

        Scanner ler = new Scanner(System.in);

        HashMap<String, Double> CPFnotas = new HashMap<String, Double>();

        System.out.println();

        for (int i=1; i<=3; i++){

            System.out.print("CPF do aluno " + i + ": ");
            cpf = ler.next();

            System.out.print("Nota do aluno " + i + ": ");
            nota = ler.nextDouble();

            CPFnotas.put(cpf, nota);

            System.out.println();

        }

        System.out.println(CPFnotas);

        cpf = "76460520356";

        System.out.println("\nNota do aluno com o CPF 764.605.203-56: " + CPFnotas.get(cpf));

    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
