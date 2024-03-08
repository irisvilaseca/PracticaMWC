package org.example;

public class Main {
    public static void main(String[] args) {
        Altre rellotge=new Altre("desconegut", "desconegut", 100, "Rellotge intel·ligent");
        Smartphone mobil=new Smartphone("desconegut","desconegut",300,"Android",false,false);
        Smartphone iPhone=new Smartphone("Apple", "desconegut", 500,"Apple", true, true);
        Tablet tablet=new Tablet("desconegut","desconegut",400,1000);
        Altre iPod=new Altre("Apple","iPod3",30,"Dispositiu musical");
        System.out.println(rellotge);
        System.out.println(mobil);
        System.out.println(iPhone);
        System.out.println(tablet);
        System.out.println(iPod);

        //Mostrem el preu base i el preu final dels dispositius creats
        System.out.printf("El preu base del rellotge és %d € i el preu final és %.2f € \n",rellotge.getPreuBase(),rellotge.calculaPreuFinal());
        System.out.printf("El preu base del mòbil és %d € i el preu final és %.2f € \n",mobil.getPreuBase(),mobil.calculaPreuFinal());
        System.out.printf("El preu base de l'iphone és %d € i el preu final és %.2f € \n",iPhone.getPreuBase(),iPhone.calculaPreuFinal());
        System.out.printf("El preu base de la tablet és %d € i el preu final és %.2f € \n",tablet.getPreuBase(),tablet.calculaPreuFinal());
        System.out.printf("El preu base de l'iPod és %d € i el preu final és %.2f € \n",iPod.getPreuBase(),iPod.calculaPreuFinal());

        Dispositiu [] dispositius= {rellotge,mobil,iPhone,tablet,iPod};
        for(int i=0; i< dispositius.length;i++){
            if(dispositius[i].isGammaAlta()){
                System.out.println(dispositius[i]);
            }
        }
    }
}