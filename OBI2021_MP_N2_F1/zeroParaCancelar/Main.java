import java.util.*;

import javax.print.event.PrintEvent;

class Main{
    
    
    
    public static void main(String[] args) {
        
    int nNumeros, soma = 0,x;
    LinkedList numeros = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    
    do{
        nNumeros = sc.nextInt();
    }while(nNumeros<1);
    
    // numeros.add(2);
    for(int i=0;i<nNumeros;i++){
        x=sc.nextInt();
        if(x>=1 && x<=100) numeros.add(x);
        else if(x==0) numeros.removeLast();
        else i--; 
        
    
    }
    
    if (numeros.size() == 0){
        System.out.println(soma);
    }
    else{
        for(int j = 0 ; j <=numeros.size(); j++){

        soma += (int) numeros.getLast();
        numeros.removeLast(); 
    }
    System.out.println(soma);
    }// numeros = new int[nNumeros];
    
    
    
    }
}