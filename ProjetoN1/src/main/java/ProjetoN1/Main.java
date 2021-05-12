
package ProjetoN1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int player1[] = new int[3];
        int player2[] = new int[3];
        
        
        
        System.out.println("JOGADOR 1");
        System.out.println("Digite o número dos monstros ecolhidos:");
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<3; i++){
        player1[i] = entrada.nextInt();
        }
        
        System.out.println("JOGADOR 2");
        System.out.println("Digite o número dos monstros ecolhidos:");
        
        for(int i=0; i<3; i++){
        player2[i] = entrada.nextInt();
        }
        
        
        
        
        
        
        
    }
    
}
