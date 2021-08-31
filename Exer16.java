
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int base = teclado.nextInt();
        int exp = teclado.nextInt();

	teclado.close();
        
        int pot =1;
        
        for(int i= 0; i< exp;i++){
            pot*= base;
        }
        
        System.out.println(pot);
        
    }
}
