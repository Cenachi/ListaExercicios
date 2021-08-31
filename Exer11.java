
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
                
        int soma=0,n1;
        
        do{        
            n1 = teclado.nextInt();
            soma+=n1;
            
        }while(n1 !=0);

	teclado.close();
        
        System.out.println(soma);
    }
}