package com.example.healthx;

public class Kayttajatiedot {
    String Nimi;
    int Ika;
    String Sukupuoli;
    int Pituus;
    int Paino;

    public Kayttajatiedot(String nimi, int ika, String sukupuoli, int pituus, int paino) {
        this.Nimi = nimi;
        this.Ika = ika;
        this.Sukupuoli = sukupuoli;
        this.Pituus = pituus;
        this.Paino = paino;
    }

    public String getNimi() {
        return Nimi;
    }
    public int getIka() {
        return Ika;
    }
    public String getSukupuoli() {
        return Sukupuoli;
    }
    public int getPituus() {
        return Pituus;
    }
    public int getPaino() {
        return Paino;
    }
}
