
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();

	teclado.close();
        
        if(n %2 ==0 && n%5 ==0){
            n+=5;
        }else if(n % 2 != 0){
            n+=8;
        }
        
        System.out.println(n);
    }
}
