package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        double per,area;
        
        System.out.println("INSERTE EL NUMERO DE LADOS");
        Scanner nlados= new Scanner (System.in);
        int nl= nlados.nextInt();
                
        System.out.println("INSERTE LONGITUD");
        Scanner longlados= new Scanner (System.in);
        double ll= longlados.nextDouble();
          
        System.out.println("INSERTE APOTEMA");
        Scanner apot= new Scanner (System.in);
        double ap= apot.nextDouble();
        
        
        per=nl*ll;
        System.out.println("PERIMETRO="+per);
        
        area= (per*ap)/2;
        System.out.println("AREA ="+area);
        
        if(nl==3){
            System.out.println("TRIANGULO");
        }
        if(nl==4){
            System.out.println("CUADRADO");
        }
        if(nl==5){
            System.out.println("PENTAGONO");
        }
        if(nl==6){
            System.out.println("HEXAGONO");
        }if(nl==7){
            System.out.println("HEPTAGONO");
        }
        if(nl==8){
            System.out.println("OCTOGONO");
        }
        if(nl==9){
            System.out.println("ENEAGONO");
        }
        if(nl==10){
            System.out.println("DECAGONO");
        }
        if(nl==11){
            System.out.println("UNDECAGONO");
        }
        if(nl==12){
            System.out.println("DODECAGONO");
        }
        
        
        
    }
    
}
