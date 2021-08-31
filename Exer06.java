
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        double peso = teclado.nextDouble();
        double altura =  teclado.nextDouble();

	teclado.close();
        
        double imc = peso / (altura*altura);
        
        if(imc<18.5){
            System.out.println("abaixo do peso");
        }else if(imc>=18.5 && imc<25.0){
            System.out.println("peso normal");
        }else if(imc>=25.0 && imc<=30.0){
            System.out.println("acima do peso");
        }else if(imc > 30.0){
            System.out.println("obeso");
        }
    }
}