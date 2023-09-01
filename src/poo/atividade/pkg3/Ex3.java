/******************************************************************************
Um  programa  capaz  de  imprimir  todos  os  números  primos  em  um  intervalo
de números informado pelo usuário

*******************************************************************************/

import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        int ni, nf;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com o inicio do intervalo: ");
        ni = input.nextInt();
        System.out.println("Entre com final do intervalo: ");
        nf = input.nextInt();

        for(int i = ni; i < nf; i++){
            if(i <= 1)
            System.out.println("Numero nao primo");
        }else if(i <= 3)
            System.out.println("Numero nao primo");
    }
}

public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }