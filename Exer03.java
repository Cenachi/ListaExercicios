
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String estado = teclado.nextLine();
        
        teclado.close();
        
        if(estado.equalsIgnoreCase("RJ")){
            System.out.println("carioca");
        }else if(estado.equalsIgnoreCase("SP")){
            System.out.println("paulista");
        }else if(estado.equalsIgnoreCase("MG")){
            System.out.println("mineiro");
        }else if(estado.equalsIgnoreCase("RN")){
            System.out.println("potiguar");
        }else if(estado.equalsIgnoreCase("ES")){
            System.out.println("capixaba");
        }else if(estado.equalsIgnoreCase("RS")){
            System.out.println("gaucho");
        }else if(estado.equalsIgnoreCase("SC")){
            System.out.println("catarino");
        }else{
            System.out.println("outro estado");
        }
    }
}