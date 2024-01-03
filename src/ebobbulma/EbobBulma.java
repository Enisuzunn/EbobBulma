
package ebobbulma;

import java.util.Scanner;

public class EbobBulma {
    public static int ebobBulma(int sayı1 , int sayı2){
        
        int ebob =1;
        
        for(int i = 1; i<=sayı1 && i<=sayı2; i++){
            if ((sayı1 % i == 0) && (sayı2 % i == 0)) {
                ebob = i;
                
            }
        }
        return ebob;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Birinci sayı : ");
        int birinci_sayi = scanner.nextInt();
        
        System.out.println("İkinci sayı : ");
        int ikinci_sayi = scanner.nextInt();
        
        System.out.println("İki sayımızın ebobu = " + ebobBulma(birinci_sayi, ikinci_sayi));
    }
    
}
