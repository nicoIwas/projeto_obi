import java.util.*;

class cifra{
    public static char  alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static char vogais[] = {'a','e', 'i','o','u'};
    public static char  consoante[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};



    public static boolean checaVogal(char mediador[], int i){
        
        for (int j = 0; j < vogais.length; j++) {
            if(mediador[i] == vogais[j]) return true;
        }
        return false;
    }
    
    public static void codifica(char mediador[], int i){
        
        System.out.print(mediador[i]);
        
        int distancia = 27, posicao = 0;
        
        for(int k = 0; k<alfabeto.length ; k++){
            if(mediador[i] == alfabeto[k]) {
                posicao = k;
                break;
            }
        }
        
        int posicaoAlfabetoVogal = 0;
        int vogaisNoAlfabeto[]= {0,4,8,14,20};
        for (int j = 0; j < vogaisNoAlfabeto.length; j++) {
            if(posicao>vogaisNoAlfabeto[j]){
                if(posicao-vogaisNoAlfabeto[j]<=distancia) {
                    distancia = posicao-vogaisNoAlfabeto[j];
                    posicaoAlfabetoVogal = vogaisNoAlfabeto[j];
                }}
            else if(posicao<vogaisNoAlfabeto[j]){
                if(vogaisNoAlfabeto[j] - posicao<distancia){
                    distancia = vogaisNoAlfabeto[j] - posicao;
                    posicaoAlfabetoVogal = vogaisNoAlfabeto[j];
                } 
                    
            }
        }
        System.out.print(alfabeto[posicaoAlfabetoVogal]);
        
        if(posicao!=25){

            for (int a = posicao+1; a < alfabeto.length; a++) {
                if(!checaVogal(alfabeto, a)){
                    System.out.print(alfabeto[a]);
                    break;
                } 
            }
        }
        else System.out.print("z");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int distancia;
        String original, codigo;
        char mediador[];
        
        
        
        original = sc.nextLine();
        mediador = original.toCharArray();

        
        for (int i = 0; i < mediador.length; i++) {
            if(!checaVogal(mediador, i)) codifica(mediador,i);
            else if(checaVogal(mediador, i)) System.out.print(mediador[i]);
        }
        System.out.println();
    }
}