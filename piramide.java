import java.util.Scanner;
public class piramide{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);

        double Lb, Hb, Ab, P, Al, Hfl, lado1, lado2, lado3, s, Hisos, Hfl1, Hp, total;
        int Tipo;

        System.out.println("Digite o tamanho do lado da base: ");
        Lb = leia.nextDouble();
        System.out.println("Digite a altura da base: ");
        Hb = leia.nextDouble();
        System.out.println("Qual a altura da face lateral da piramide?");
        Hfl = leia.nextDouble();
        System.out.println("Qual a altura da piramde? (do topo ao centro da base)");
        Hp = leia.nextDouble();
        System.out.println("Sua pirâmide tem qual base? (Digite o número de acordo com a forma geometrica)");   
        System.out.println("1- Quadrado");
        System.out.println("2- Triangular");
        System.out.println("3- Pentagonal");
        Tipo = leia.nextInt();

        switch(Tipo){
            case 1:
                Ab =  Lb * Hb;
                P = 4 * Lb;
                Al = (P*Hfl)/2;
                total = Ab * Al;    

                break;
            
            case 2: 
                System.out.println("Qual o tamanho dos lados do seu triangulo?");
                lado1 = leia.nextDouble();
                lado2 = leia.nextDouble();
                lado3 = leia.nextDouble();
                if((lado1 == lado2) && (lado1 == lado3)){
                    Ab = (lado1*lado1) * Math.sqrt(3)/4;
                    P = 3 * lado1;
                    Al = (P * Hfl)/2;
                    total = Ab * Al;
                     System.out.println("A área da sua piramide é: " + total);
                }
                if((lado1 != lado2) && (lado2 != lado3)){
                    s = (lado1 + lado2 +lado3)/2;
                    Ab = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
                    P = lado1 + lado2 + lado3;
                    Al = (P * Hfl)/2;
                    total = Al + Ab;
                     System.out.println("A área da sua piramide é: " + total);
                }
                if(lado1 == lado2 || lado2==lado3 || lado1 == lado3){
                    if(lado1 == lado2){
                        Hisos = Math.sqrt(lado1*lado1-(lado3/2)*(lado3/2));
                        Ab = (lado3*Hisos)/2;
                        P = lado1+lado2+lado3;
                        Al = (P*Hfl)/2;
                        total = Ab + Al;    
                         System.out.println("A área da sua piramide é: " + total);
                    }
                    else{
                        if(lado1==lado3){
                            Hisos = Math.sqrt(lado1*lado3-(lado2/2)*(lado2/2));
                            Ab = (lado2*Hisos)/2;
                            P = lado1+lado2+lado3;
                            Al = (P*Hfl)/2;
                            total = Ab + Al; 
                             System.out.println("A área da sua piramide é: " + total);
                        }
                        else{
                            Hisos = Math.sqrt(lado2*lado3-(lado1/2)*(lado1/2));
                            Ab = (lado1*Hisos)/2;
                            P = lado1+lado2+lado3;
                            Al = (P*Hfl)/2;
                            total = Ab + Al; 
                             System.out.println("A área da sua piramide é: " + total);
                        }
                    }
                }
            break;
            case 3:
            System.out.println("Qual o tamanho dos lados do seu triangulo?");
                lado1 = leia.nextDouble();
                lado2 = leia.nextDouble();
                lado3 = leia.nextDouble();
            P = 5 * lado1;
            Hfl1 = lado1/(2*Math.toRadians(36));
            Ab = (5*lado1*Hfl1)/2;
            Al =  (P*Hfl)/2;
            total = Ab + Al;
             System.out.println("A área da sua piramide é: " + total);
        }    
    }
}