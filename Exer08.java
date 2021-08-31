
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double nt1 = teclado.nextDouble();
        double nt2 = teclado.nextDouble();
        double nt3 = teclado.nextDouble();
        double nt4 = teclado.nextDouble();

	teclado.close();
        
        double media = (nt1+nt2+nt3+nt4)/4;
        
        if(media >= 7){
            System.out.println("aprovado");
        }
        if(media >= 5 && media < 7){
            System.out.println("recuperacao");
        }
        if(media < 5){
            System.out.println("reprovado");
        }
    }
}