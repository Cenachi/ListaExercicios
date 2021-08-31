
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double av1 = teclado.nextDouble();
        double av2 = teclado.nextDouble();
        double frequencia = teclado.nextDouble();

	teclado.close();
        
        double media = (av1+av2)/2;
        
        if((frequencia<50)||(av1< 4.0 && av2<4.0)){
            System.out.println("reprovado");
        }else if((av1 < 4.0 || av2 < 4.0) || media <6.0){
            System.out.println("recuperacao");
        }else{
            System.out.println("aprovado");
        }
    }
}
