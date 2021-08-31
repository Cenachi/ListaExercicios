
import java.text.DecimalFormat;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        double a1 = teclado.nextDouble();
        double a2 = teclado.nextDouble();
        double a3 = teclado.nextDouble();
        double a4 = teclado.nextDouble();
        
        teclado.close();
        
        double maior = a1;
        double menor = a1;
        
        if(a2>maior){
            maior = a2;
        }        
        if(a2 < menor){
            menor = a2;
        }
        
        if(a3>maior){
            maior = a3;
        }        
        if(a3 < menor){
            menor = a3;
        }
        
        if(a4>maior){
            maior = a4;
        }        
        if(a4 < menor){
            menor = a4;
        }
        
        double media =(a1+a2+a3+a4)/4;
        
        DecimalFormat df = new DecimalFormat("0.0");                           
        
        System.out.println("Maior altura: "+maior+" metros");
        System.out.println("Menor altura: "+menor+" metros");
        System.out.println("Altura media: "+df.format(media)+" metros");
    }
}