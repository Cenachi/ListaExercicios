
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        
	teclado.close();

        if(n1 > n2 && n1>n3){
            System.out.println(n1);            
            if(n2>n3){
                System.out.println(n2 + "\n"+n3);
            }else{
                System.out.println(n3 + "\n"+n2);
            }
        }
        
        if(n2 > n1 && n2>n3){
            System.out.println(n2);            
            if(n1>n3){
                System.out.println(n1 + "\n"+n3);
            }else{
                System.out.println(n3 + "\n"+n1);
            }
        }
        
        if(n3 > n1 && n3>n2){
            System.out.println(n3);            
            if(n1>n2){
                System.out.println(n1 + "\n"+n2);
            }else{
                System.out.println(n2 + "\n"+n1);
            }
        }        
    }    
}