import java.util.Scanner;
public class bola {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);

        Double R, D, total;

        System.out.println("Digite o diametro da bola: ");
        D = leia.nextDouble();
        

        R = D/2;
        total = 4*3.14*(R*R);

        System.out.println("A Área da bola é de: " + total);
    }
}
