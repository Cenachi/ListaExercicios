
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();

	teclado.close();

        int fat = 1;
        
        for(int i= 1; i<= n;i++){
            fat*= i;
        }
        
        System.out.println(fat);
    }
}
