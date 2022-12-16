// encapsulation
// konstruktor
//inheritens
    
public class Lingkaran extends bangundatar{
    private double jari;
    public double pivalue;

    public Lingkaran(){
        this.jari = 0;
        this.pivalue = 22/7.0;
    }

    public void setJari(double nilaijari){
        this.jari = nilaijari;
    }
   
    public double getjari(){
        return this.jari;
    }

    @Override
    double luas(){
        double luas = pivalue * getjari() * getjari();
        System.out.println("Luas = " + luas);
        return luas;
    }


}
