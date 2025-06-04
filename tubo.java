import java.util.Scanner;

public class tubo{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);

        double D, d, R, r, h, Al, Ab, total;

        System.out.println("Digite a altura do seu tubo: ");
        h = leia.nextDouble();
        System.out.println("Digite o diâmetro externo do tubo: ");
        D = leia.nextDouble();
        System.out.println("Digite o diâmetro interno do tubo: ");
        d = leia.nextDouble();

        R = D/2;
        r = d/2;

        Al = 2*3.14*(R+r)*h;
        Ab = 2*3.14*((R*R) - (r+r));
        total = Ab + Al;

        System.out.println("A Área do seu tubo é de: "+ total);
    }
}