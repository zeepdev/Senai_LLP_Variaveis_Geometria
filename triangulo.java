import java.util.Scanner;
public class triangulo {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        float b, h, total;
        System.out.println("Digite a base do triângulo:");
        b = leia.nextFloat();
        System.out.println("Digite a altura:");
        h = leia.nextFloat();
        total = (b*h)/2;
        System.out.println("A área total do triângulo é: " + total);
    }
    
}
