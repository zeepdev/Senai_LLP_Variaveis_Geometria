import java.util.Scanner;
public class retangulo {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        float lado1;
        float lado2;
        float total;
        System.out.println("Digite a base do retângulo:");
        lado1 = leia.nextInt();
        System.out.println("Digite a altura do retângulo:");
        lado2 = leia.nextInt();
        total = lado1 * lado2;
        System.out.println("O total é:" + total);
    }
    
}
