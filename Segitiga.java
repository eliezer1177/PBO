class Segitiga {
    double tinggi;
    double alas;

    Segitiga(double alas, double tinggi) {
        this.tinggi = tinggi;
        this.alas = alas;
    }
    // public void settinggi(double tinggi9){
    //     this.tinggi = tinggi9;
    // }    

    // public void setalas(double alas9){
    //     this.alas = alas9;
    // }

    // public double gettinggi(){
    //     return this.tinggi;
    // }
    // public double getalas(){
    //     return this.alas;
    // }

    
}


class segi3siku extends Segitiga{
    
    segi3siku(double alas, double tinggi) {
        super(alas, tinggi);
    }

    public double luas(){
    double luas = 0.5 * alas * tinggi;
    System.out.println("Luas = " + luas);
    return luas;
    } 
}

class layang extends Segitiga{
    layang(double alas, double tinggi) {
        super(alas, tinggi);
    }
    public double luas(){
        double luas = alas * tinggi;
        System.out.println("Luas = " + luas);
        return luas;
    }
}


