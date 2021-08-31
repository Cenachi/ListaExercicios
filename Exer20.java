
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
                
        int dias = teclado.nextInt();
        
        int soma=0, media=0, menor = 999999999, maior = -999999999;
        
        for(int i=0; i< dias;i++){
            int quant = teclado.nextInt();
            
            soma+=quant;
            
            if(quant>maior){
                maior= quant;
            }
            
            if(quant<menor){
                menor=quant;
            }
        }
        
	teclado.close();

        media = soma / dias;
        
        System.out.println("Quantidade produzida nos "+dias+" dias: "+soma);
        System.out.println("Media diaria de producao: "+ media);
        System.out.println("Menor producao diaria: "+ menor);
        System.out.println("Maior producao diaria: "+maior);
               
    }
}