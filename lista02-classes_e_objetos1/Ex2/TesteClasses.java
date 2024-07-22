package Ex2;

import java.util.Scanner;

public class TesteClasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Universidade universidade = new Universidade();
        
        System.out.println("Insira o nome do aluno:");
        aluno.setDadosNomeAluno(scan.nextLine());
        System.out.println("Insira o curso do aluno:");
        aluno.setDadosCurso(scan.nextLine());
        System.out.println("Insira o nome da universidade:");
        universidade.setDadosNomeUniversidade(scan.nextLine());
        System.out.println("Insira a cidade da universidade:");
        universidade.setDadosCidade(scan.nextLine());
        System.out.println("Insira o estado da universidade:");
        universidade.setDadosEstado(scan.nextLine());
        

        universidade.exibeDados();
        aluno.exibeDados();

        scan.close();
    }
}
