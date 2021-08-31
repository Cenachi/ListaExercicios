
import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                
        double menor, maior, soma=0;
        double delMaior1=0, delMenor1=0, delMaior2=0, delMenor2=0,delMaior3=0, delMenor3=0;
        int aux = 0;
        
        do{
            
            double alt1 = teclado.nextDouble();
            double alt2 = teclado.nextDouble();
            double alt3 = teclado.nextDouble();
            double alt4 = teclado.nextDouble();
                        
            soma += (alt1+ alt2+ alt3+ alt4);
            
            menor = alt1;
            maior = alt1;
            
            //Delegação 1
            if(aux == 0){
                if(alt2 > maior){
                    maior=alt2;
                }
                if(alt2 < menor){
                    menor = alt2;
                }
                
                if(alt3 > maior){
                    maior=alt3;
                }
                if(alt3 < menor){
                    menor = alt3;
                }
                
                if(alt4 > maior){
                    maior=alt4;
                }
                if(alt4 < menor){
                    menor = alt4;
                }
                
                delMaior1 = maior;
                delMenor1 = menor;
            }
            
            //Delegação 2
            if(aux == 1){
                if(alt2 > maior){
                    maior=alt2;
                }
                if(alt2 < menor){
                    menor = alt2;
                }
                
                if(alt3 > maior){
                    maior=alt3;
                }
                if(alt3 < menor){
                    menor = alt3;
                }
                
                if(alt4 > maior){
                    maior=alt4;
                }
                if(alt4 < menor){
                    menor = alt4;
                }
                
                delMaior2 = maior;
                delMenor2 = menor;
            }
            
            //Delegação 3
            if(aux == 2){
                if(alt2 > maior){
                    maior=alt2;
                }
                if(alt2 < menor){
                    menor = alt2;
                }
                
                if(alt3 > maior){
                    maior=alt3;
                }
                if(alt3 < menor){
                    menor = alt3;
                }
                
                if(alt4 > maior){
                    maior=alt4;
                }
                if(alt4 < menor){
                    menor = alt4;
                }
                
                delMaior3 = maior;
                delMenor3 = menor;
            }
            
            aux++;
        }while(aux<3);
        
        teclado.close();
        
        double media = soma/12;
        
        DecimalFormat df = new DecimalFormat("0.0#");
                                       
        System.out.println("Maior altura");
        System.out.println("Delegacao 1: "+delMaior1);
        System.out.println("Delegacao 2: "+delMaior2);
        System.out.println("Delegacao 3: "+delMaior3+"\n");
        
        System.out.println("Menor altura");
        System.out.println("Delegacao 1: "+delMenor1);
        System.out.println("Delegacao 2: "+delMenor2);
        System.out.println("Delegacao 3: "+delMenor3+"\n");
              
        System.out.println("Altura media: "+df.format(media));
        
    }
}
