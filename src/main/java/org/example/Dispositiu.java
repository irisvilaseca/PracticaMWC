package org.example;

public class Dispositiu implements DispositiuInterface,GammaAlta {
    private String marca;
    private String model;
    private int preuBase;

    public Dispositiu(String marca, String model, int preuBase) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(int preuBase) {
        this.preuBase = preuBase;
    }
    @Override
    public String toString() {
        return "Dispositiu{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", preuBase=" + preuBase +
                '}';
    }

    @Override
    public double calculaPreuFinal() {
        return this.preuBase*2;
    }

    @Override
    public boolean isGammaAlta() {
        return false;
    }
}
