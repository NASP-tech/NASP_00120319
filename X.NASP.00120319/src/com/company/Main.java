package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner t = new Scanner(System.in);
        int valor = 0;
        int n = 10;
        int[] arreglo = new int[n];


        for(int i = 0; i< arreglo.length; i++){
            System.out.println("Dame un valor: "+(i+1));
            valor =  t.nextInt();
            arreglo[i] = valor;
        }
        for(int i: arreglo){
            if (i%2==0)
                System.out.println("El número es par " + i);

        }


    }


}
