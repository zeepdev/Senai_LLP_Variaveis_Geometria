import java.util.Scanner;
public class caixa {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        double c, l, h, total;
        System.out.println("Digite o comprimento da caixa em cm: ");
        c = leia.nextDouble();
        System.out.println("Digite a largura da caixa em cm: ");
        l = leia.nextDouble();
        System.out.println("Digite a altura da caixa em cm: ");
        h = leia.nextDouble();
        total = (2*(c * l) + 2*(c * h) + 2*(h * l));
        System.out.println("A área da caixa é: " + total + " cm");

    }
    
}
