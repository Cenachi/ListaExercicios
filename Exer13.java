
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n1= teclado.nextInt();
        int n2= teclado.nextInt();
        
        while(n2 == 0){
            n2= teclado.nextInt();
        }

	teclado.close();
        
        int div = n1/n2;
        
        System.out.println(div);
    }
}