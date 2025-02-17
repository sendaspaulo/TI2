import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        // Criando um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando os números ao usuário
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        // Calculando a soma
        int soma = num1 + num2;
        
        // Exibindo o resultado
        System.out.println("A soma dos números é: " + soma);
        
        // Fechando o scanner
        scanner.close();
    }
}
