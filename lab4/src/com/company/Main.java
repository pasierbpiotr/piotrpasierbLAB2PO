package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
       Zadanie1();
       Zadanie2();
       Zadanie3();
    }

        public static void Zadanie1() {
            int[] tab1 = {1,2,3,4,5};
            int suma1=0;
            int suma2=0;
            for(int i=0;i<tab1.length;i++) suma1 += tab1[i];
            for (int i:tab1) suma2+=i;
            int srednia=0;
            srednia=suma1/tab1.length;
            System.out.println("Suma1: "+suma1+", suma2: "+suma2+", srednia: "+srednia);
        }

    public static void Zadanie2() {
    boolean[] tab2 = new boolean[20];
        for(int i=0;i<tab2.length;i++) {
            if(i%2==0)
            {
                tab2[i]=true;
            }
            else {
                tab2[i]=false;
            }
            System.out.println("Dla "+i+": "+tab2[i]);
        }

    }

    public static double Losuj() {
        Random rand = new Random();
        double liczba = rand.nextInt(45)-10;
        return liczba;
    }

    public static void Zadanie3() {
        double[] tab3 = new double[20];
        double suma=0, sumaRoznic=0, srednia=0;
        System.out.println("Elementy tablicy: ");
        for(int i=0;i<tab3.length;i++) {
            tab3[i]=Losuj();
            suma+=tab3[i];
            System.out.println(tab3[i]+"\t");
        }
        srednia=suma/tab3.length;
        System.out.println("\nSuma: "+suma+"\nsrednia pomiarow: "+srednia);

        for(int i=0; i<tab3.length;i++) {
            sumaRoznic+=(tab3[i]-srednia)*(tab3[i]-srednia);
        }
        System.out.println("Suma roznic: "+sumaRoznic);
        System.out.println("Wariancja: "+sumaRoznic/(double)((tab3.length)-1));
    }
}
