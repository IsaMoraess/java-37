import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Resolva uma equação do segundo grau da forma ax2 + bx + c = 0, onde o usuário fornece os 
        //coeficientes a, b e c. Calcule as raízes usando a fórmula de Bhaskara.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores de a, b e c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        double x1 = ( -b + Math.sqrt(delta)) / 2*a;
        double x2 = ( -b - Math.sqrt(delta)) / 2*a;

        System.out.println("as raizes são: " + x1 + " e " + x2 + " ");
    }
}
