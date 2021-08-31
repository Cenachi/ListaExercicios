
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();

	teclado.close();
        
        int soma=0;
        
        for(int i=0; i<=n;i++){
            if(i%2 !=0){
                soma+=i;
            }
        }
        
        System.out.println(soma);
    }
}