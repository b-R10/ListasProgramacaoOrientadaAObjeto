
import java.util.Scanner;


public class TestePessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa obj = new Pessoa();
        
        System.out.println("Insira o nome:");
        obj.set_nome(scan.nextLine());
        System.out.println("Insira o telefone:");
        obj.set_telefone(scan.nextLine());
        obj.exibe_dados();

        scan.close();
    }
}