import java.util.Scanner;
public class circulo {
    public static void main(String[]args){

        Scanner leia = new Scanner(System.in);
        double diametro, raio, total;
        
        System.out.println("Digite o diametro: ");
        diametro = leia.nextDouble();
        raio = diametro/2;
        total = 3.14 * (raio * raio);

        System.out.println("A área do ciruculo é de: " + total);

    }
}
