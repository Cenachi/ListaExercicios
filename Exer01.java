
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
      
        Scanner teclado  = new Scanner(System.in);
        
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        int n4 = teclado.nextInt();
        
	teclado.close();

        int menor = n1;
        
        if(n2< menor){
            menor = n2;
        }
        
        if(n3< menor){
            menor = n3;
        }
        
        if(n4< menor){
            menor = n4;
        }
        
        System.out.println(menor);
                
    }
    
}
