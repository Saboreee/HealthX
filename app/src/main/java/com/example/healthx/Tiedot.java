package com.example.healthx;

import java.util.ArrayList;

public class Tiedot {
    private ArrayList<Tiedot> Atiedot;
    private int fiilis;
    private String nimireps;
    private int reps;
    private int uni;

    private static Tiedot instance;

    public Tiedot(String nimireps ,int reps) {
        this.nimireps = nimireps;
        this.reps = reps;
    }

    private Tiedot() {
        Atiedot = new ArrayList<>();
    }

    public static Tiedot getInstance() {
        if (instance == null) {
            instance = new Tiedot();
        }
        return instance;
    }

    public ArrayList<Tiedot> getAtiedot() {
        return Atiedot;
    }

    public int getFiilis() {
        return fiilis;
    }
    public int getReps() {
        return reps;
    }
    public int getUni() {
        return uni;
    }
    public String getNimireps() {
        return nimireps;
    }

    public String toString() {
        return this.nimireps + this.reps;
    }
}
