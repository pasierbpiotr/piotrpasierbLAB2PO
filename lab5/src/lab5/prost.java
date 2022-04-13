package lab5;

public class prost {
    double dlugosc, szerokosc, pole, obwod, dprzek;

    public prost(double dlugosc, double szerokosc)
    {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        pole = dlugosc*szerokosc;
        obwod = 2*dlugosc+2*szerokosc;
        dprzek = Math.sqrt(Math.abs(Math.pow(dlugosc,2.0)-Math.pow(szerokosc,2.0)));
    }
}
