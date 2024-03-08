package org.example;

public class Smartphone extends Dispositiu implements GammaAlta{
    final public static boolean TE_ACCELEROMETRE=false;
    final public static boolean TE_GPS=true;
    private String sistemaOperatiu;
    private boolean accelerometre;
    private boolean gps;


    public Smartphone(String marca, String model, int preuBase, String sistemaOperatiu, boolean accelerometre, boolean gps) {
        super(marca, model, preuBase);
        this.sistemaOperatiu = sistemaOperatiu;
        this.accelerometre = accelerometre;
        this.gps = gps;
    }

    public String getSistemaOperatiu() {
        return sistemaOperatiu;
    }

    public void setSistemaOperatiu(String sistemaOperatiu) {
        this.sistemaOperatiu = sistemaOperatiu;
    }

    public boolean isAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(boolean accelerometre) {
        this.accelerometre = accelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
    @Override
    public double calculaPreuFinal(){
        double preuBase=this.getPreuBase();
        if(this.accelerometre){
            preuBase=preuBase+ (double) 10 /100;
            if(this.gps){
                preuBase=preuBase+(double)5/100;
            }
        }
        return preuBase*2;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistemaOperatiu='" + sistemaOperatiu + '\'' +
                ", accelerometre=" + accelerometre +
                ", gps=" + gps +
                '}'+super.toString();
    }

    @Override
    public boolean isGammaAlta() {
        return this.calculaPreuFinal()>700;
    }
}
