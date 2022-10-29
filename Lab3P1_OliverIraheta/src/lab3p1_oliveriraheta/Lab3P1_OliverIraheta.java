package lab3p1_oliveriraheta;
//Por lo menos se hacer el menu ;]
import java.util.Scanner;

public class Lab3P1_OliverIraheta {

   
    public static void main(String[] args) {
        int opc=0;
        do{
            Scanner rm= new Scanner(System.in);
            System.out.println("-- Bienvenid@ al Laboratorio #3 -- ");
            System.out.println("1. Cadena repetida      2. Sumatoria        3. Reloj ");
            System.out.println("Ingrese opcion (Otro numero para salir)");
            opc = rm.nextInt();

            switch(opc){
                case 1:
                    rm = new Scanner(System.in);
                    System.out.println("Ingrese cadena (SIN ESPACIOS)");
                    String cadena= rm.nextLine();
                    int acum1=0;
                    for(int i=0; i<cadena.length(); i++){
                        char letra= cadena.charAt(i);
                        if(letra== ' '){
                            acum1= 1;
                        }
                    }
                    char letra2;
                    char punto= '.';
                    if(acum1==1){
                        System.out.println("La cadena es SIN espacios");
                    }else{
                        for(int i=0; i<cadena.length(); i++)
                            letra2 = cadena.charAt(i); 
                            System.out.println("No lo termine =[");
                    }
                    
                                                         
                   break;

                case 2:
                    System.out.println("Ingrese un numero entero positivo");
                    int k= rm.nextInt();
                    double cal1=0;
                    double cal2=0;                 
                    double cal3=0;
                    
                    if(k>0){
                        for(int n=1; n<=k; n++){
                            cal1= (2*n)+1;                      
                            cal2= (n*n)+3;         
                            int factorial=1;  
                            for(int i=1; i<=cal2; i++){
                            factorial= factorial*i;                                
                            }
                            cal3+= (cal1/factorial);                                    
                    }
                        System.out.println("Resultado: "+cal3);
                        
                    }else{
                        System.out.println("Numero no valido");
                    }
                    //depues de 5 dice infinity creo que es por que son muchos decimales 
                    break;

                case 3:
                    System.out.println("Ingrese un numero entero positivo");
                    int n = rm.nextInt();
                    for(int h=0;h<n;h++){
                        System.out.print(" * ");
                    }
                    for(int i=0; i<n-1; i++){
                        System.out.println("");
                        for(int u=0;u<=n;u++){
                            if(n-i==u){
                            System.out.print(" * ");
                            }        
                    }
                        
                    }
                    for(int h=0;h<=n;h++){
                        System.out.print(" * ");
                    }
                    System.out.println("Eso no parece un reloj *_*");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
    }while(opc<=3 && opc>=1);  
                }              
}
