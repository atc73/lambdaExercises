package interfaceFonctionnelleLambdaExo1.lambda;

import interfaceFonctionnelleLambdaExo1.lambda.models.Operation;
import interfaceFonctionnelleLambdaExo1.lambda.models.Operations;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle opération souhaitez-vous réaliser ?");
        System.out.println("1 to add");
        System.out.println("2 to substract");
        System.out.println("3 to multiply");
        System.out.println("4 to divide");
        int operationChoice = scanner.nextInt();
        System.out.println("Entrez votre 1er nombre");
        int nb1 = scanner.nextInt();
        System.out.println("Entrez votre 2ème nombre");
        int nb2 = scanner.nextInt();

        Operations add = Operations.ADD;
        Operations substract = Operations.SUBSTRACT;
        Operations multiply = Operations.MULTIPLY;
        Operations divide = Operations.DIVIDE;

        int result = 0;

        switch (operationChoice) {
            case 1:
                result = calculate((a, b) -> a + b, nb1, nb2);
                break;
            case 2:
                result = calculate((a, b) -> a - b, nb1, nb2);
                break;
            case 3:
                result = calculate((a, b) -> a * b, nb1, nb2);
                break;
            case 4:
                result = calculate((a, b) -> a / b, nb1, nb2);
            default:
                System.out.println("Choix non disponible");
        }
        System.out.println(result);
    }

    public static int calculate(Operation calculate, int nb1, int nb2) {
        return calculate.calculate(nb1, nb2);
    }
}
