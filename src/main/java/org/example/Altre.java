package org.example;

public class Altre extends Dispositiu{
    private String descripcio;

    public Altre(String marca, String model, int preuBase, String descripcio) {
        super(marca, model, preuBase);
        this.descripcio=descripcio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "Altre{" +
                "descripcio='" + descripcio + '\'' +
                '}'+super.toString();
    }
}
