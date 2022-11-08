import java.util.*;


class Main{

    public static int qualAidade(int idades[]){
    
        
    if(idades[1]<=idades[0] && idades[0]<=idades[2]) return idades[0];
    else if(idades[2]<=idades[0] && idades[0]<=idades[1]) return idades[0];
    
    else if(idades[0]<=idades[1] && idades[1]<=idades[2]) return idades[1];
    else if(idades[0]<=idades[1] && idades[1]<=idades[0]) return idades[1];
    
    else if(idades[0]<=idades[2] && idades[2]<=idades[1]) return idades[2];
    else if(idades[1]<=idades[2] && idades[2]<=idades[0]) return idades[2];
    

    return 0;

    }


    public static void main(String[] args) {
        
        int idades[], idadeDoMeio;
        Scanner sc = new Scanner(System.in);
        
        idades = new int[3];
        
        idades[0] = sc.nextInt();
        idades[1] = sc.nextInt();
        idades[2] = sc.nextInt();
        
        System.out.println("\n" + Main.qualAidade(idades));
    }
}