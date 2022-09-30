package com.example.zadanie0.model;

public class Procent {

    private Double summa;

    private Double procent;

    private Double itog;

    public double getsumma()
    {
        return summa;
    }
    public Double setsumma(Double summa)
    {
        this.summa = summa;
        return summa;
    }
    public double getprocent()
    {
        return procent;
    }
    public double setprocent(Double procent)
    {
        this.procent = procent;
        return procent;
    }

    public Double calc(Double summa,Double procent)
    {
        itog = (summa / 100) * procent;
        return itog;
    }
}
