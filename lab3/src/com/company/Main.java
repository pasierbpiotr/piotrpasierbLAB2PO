package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zadanie1();
        Zadanie2();
        Zadanie3();
        Zadanie4();
        Zadanie5("kajak");
    }

    public static void Zadanie1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilosc studentow: ");
        double pkt, suma = 0;
        int n = scan.nextInt();
        int i=0;
        while(i<n)
        {
            Random rand = new Random();
            pkt = rand.nextDouble(50)+1;
            suma += pkt;
            i++;
        }
        System.out.println("Srednia punktow: "+(suma/n));
    }

    public static void Zadanie2() {
        double a=0, sumad=0, sumau=0;
        int iled=0, ileu=0;
        for(int i=0;i<10;i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj "+(i+1)+" liczbe: ");
            a = scan.nextDouble();
            if (a == 0) {
                System.out.println("Liczba rowna jest 0");
                i--;
            } else {
                if (a > 0) {
                    iled++;
                    sumad += a;
                } else {
                    ileu++;
                    sumau += a;
                }
            }
        }
        System.out.println("Ilosc dodatnich: "+iled);
        System.out.println("Suma dodatnich: "+sumad);
        System.out.println("Ilosc ujemnych: "+ileu);
        System.out.println("Suma ujemnych: "+sumau);
    }

    public static void Zadanie3() {
        double suma=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj do jakiej liczby ciag: ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++) {
            if(i%2==0) suma += i;
        }
        System.out.println("Suma ciagu liczb parzystych: "+suma);
    }

        public static void Zadanie4() {
            int a=0, suma = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ile liczb: ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++) {
            Random rand = new Random();
            a = rand.nextInt(45)-10;
            System.out.println(a);
            if(a%2==0) suma += a;
        }
        System.out.println("Suma liczb parzystych: "+suma);
    }

    public static boolean Zadanie5(String tekst) {
        for(int i=0;i<tekst.length()/2;i++) {
            char znak = tekst.charAt(i);
            char przeciwnyZnak = tekst.charAt(tekst.length()-1-i);

            if(znak != przeciwnyZnak) return false;
        }
        return true;
    }


}
