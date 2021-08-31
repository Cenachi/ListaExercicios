
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
                      
        double salario = teclado.nextDouble();
        double prestacao = teclado.nextDouble();

	teclado.close();
        
        double valor = salario *0.3;
        
        if(prestacao>valor){
            System.out.println("nao");
        }else{
            System.out.println("sim");
        }
    }    
}
