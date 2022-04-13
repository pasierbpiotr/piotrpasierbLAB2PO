package lab5;

//import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args){
        imie();
        int zmienna=0;
        prost p1 = new prost(6,2);
        System.out.println("Pole: "+p1.pole);
        System.out.println("Obwod: "+p1.obwod);
        System.out.println("Przekatna: "+p1.dprzek);

        budynek b1 = new budynek();
        System.out.println("Nazwa budynku: "+b1.nazwa);
        System.out.println("Kiedy zostal postawiony: "+b1.rok);
        zmienna=2022-b1.rok;
        System.out.println("Ile ma lat: "+zmienna);
        System.out.println("Ile ma pieter: "+b1.pietra);
    }

    public static void imie() {
       String imie = "Piotr";
       String nazwisko = "Pasierb";
       int wiek = 22;
        System.out.println(imie+" "+nazwisko+" lat: "+wiek);
    }

}

