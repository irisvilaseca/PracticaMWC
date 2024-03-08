package org.example;

public class Tablet extends Dispositiu implements GammaAlta{
    private int polsades;

    public Tablet(String marca, String model, int preuBase, int polsades) {
        super(marca, model, preuBase);
        this.polsades = polsades;
    }

    public int getPolsades() {
        return polsades;
    }

    public void setPolsades(int polsades) {
        this.polsades = polsades;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "polsades=" + polsades +
                '}'+super.toString();
    }

    @Override
    public boolean isGammaAlta() {
        return this.calculaPreuFinal()>900;
    }

}
