
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int hh = teclado.nextInt();
        int mm = teclado.nextInt();
        int ss = teclado.nextInt();

	teclado.close();
        
        int segundos = (hh*3600)+(mm*60)+ss;
        
        System.out.println(segundos);
        
    }
}
