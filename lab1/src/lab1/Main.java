package lab1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Zad1();
        Zad2();
        System.out.println(Zad3(6));
        System.out.println(Zad4(15));
        System.out.println(Zad5(3));
        System.out.println(Zad6(9));
        System.out.println(Zad7());
    }

    public static void Zad1() {
        String imie = "Piotr";
        int wiek = 22;
        System.out.println("Imie: "+imie+"\nWiek: "+wiek);
    }

    public static void Zad2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        double a = scan.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double b = scan.nextDouble();
        System.out.println("Suma: "+(a+b));
        System.out.println("Roznica: "+(a-b));
        System.out.println("Iloczyn: "+(a*b));
    }

    public static boolean Zad3(double a) {
        if(a%2==0)
            return true;
        else
            return false;
    }

    public static boolean Zad4(double a) {
        if(a%3==0 && a%5==0)
            return true;
        else
            return false;
    }

    public static double Zad5(double a) {
        return a*a*a;
    }

    public static double Zad6(double a) {
        return Math.sqrt(a);
    }

    public static boolean Zad7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int odkad = scan.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int dokad = scan.nextInt();
        Random rand = new Random();
        int a = rand.nextInt(dokad-odkad)+odkad;
        int b = rand.nextInt(dokad-odkad)+odkad;
        int c = rand.nextInt(dokad-odkad)+odkad;
        System.out.println("A: "+a+" B: "+b+" C: "+c);
        if(a*a+b*b==c*c) {
            return true;
        }
        else
        {
            if(b*b+c*c==a*a) {
                return true;
            }
            else
            {
                if(c*c+a*a==b*b)
                {
                    return true;
                }
                else return false;
            }
        }
    }

}
