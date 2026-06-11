import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Matricula> listaFuncionario = new ArrayList<>();

        for (int i = 1; i<=2; i++){
            System.out.println("Funcionário "+i);
            System.out.println("Matrícula: ");
            int matricula = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Nome: ");
            String nome = entrada.nextLine();

            System.out.println("Cargo: ");
            String cargo = entrada.nextLine();

            System.out.println("Salário: ");
            int salario = entrada.nextInt();

            Matricula funcionario = new Matricula(matricula, nome, cargo, salario);
            listaFuncionario.add(funcionario);

        }
        System.out.println("\nLista de Funcionários");
        for (Matricula f:listaFuncionario){
            f.Show();
            System.out.println();
        }
        entrada.close();
    }
}
