// Nama: Eliezer Renden Rambupadang
// NIM: D121211065

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class bangundatar {
    double luas(){
        System.out.println("Luas = ");
        return 0;
    }
}

public class Hitung {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

            Lingkaran ling = new Lingkaran();
            double a = 1, b = 1;
            Segitiga segi3 = new Segitiga(a, b);

            System.out.println("Menu pilihan:");
            System.out.println("1. Lingkaran\n2. SegiEmpat\n3. Segitiga\n4. Layang layang\n");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:         
                
                    System.out.println("Perhitungan Lingkaran");
                    System.out.println("\nInput nilai Jari-jari: ");
                    double jari2 = input.nextDouble();
                    ling.setJari(jari2);
                    ling.luas();

                    File myObj = new File("C:\\Users\\eliez\\Desktop\\Java Project\\uas\\lingkaran.txt");
                    if (myObj.createNewFile()) {
                        System.out.println("File created: " + myObj.getName());
                    } else {
                        System.out.println("File telah ada");
                    }

                    FileWriter myWriter = new FileWriter("C:\\Users\\eliez\\Desktop\\Java Project\\uas\\lingkaran.txt", true);
                    String stringdouble = Double.toString(ling.luas());
                    myWriter.write("Luas lingkaran adalah " + stringdouble + "\n");
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                    break;
                
                case 2:            
                    System.out.println("Perhitungan Persegi");
                    System.out.println("\nInput nilai Panjang: ");
                    double pan = input.nextDouble();
                    System.out.println("\nInput nilai lebar: ");
                    double leb = input.nextDouble();
                    
                    Persegi luas4 = (panjang, lebar) -> panjang * lebar;

                    double luassegi4 = luas4.kali(pan, leb);
                    System.out.println("Luas = " + luassegi4);

                    File myObk = new File("C:\\Users\\eliez\\Desktop\\Java Project\\uas\\segiempat.txt");
                    if (myObk.createNewFile()) {
                        System.out.println("File created: " + myObk.getName());
                    } else {
                        System.out.println("File telah ada");
                    }
                    FileWriter myWriters = new FileWriter("C:\\Users\\eliez\\Desktop\\Java Project\\uas\\segiempat.txt", true);
                    String stringdoubles = Double.toString(luassegi4);
                    myWriters.write("Luas Segiempat adalah " + stringdoubles + "\n");
                    myWriters.close();
                    System.out.println("Successfully wrote to the file.");
                    break;
                
                case 3:
                    System.out.println("Perhitungan Segitiga");
                    System.out.println("\nInput nilai alas: ");
                    double alas1 = input.nextDouble();
                    System.out.println("\nInput nilai tinggi: ");
                    double tinggi1 = input.nextDouble();
                    segi3siku segitig = new segi3siku(alas1, tinggi1);
                    System.out.println(segitig.luas());


                    File myObk1 = new File("C:\\Users\\eliez\\Desktop\\Java Project\\uas\\segitiga.txt");
                    if (myObk1.createNewFile()) {
                        System.out.println("File created: " + myObk1.getName());
                    } else {
                        System.out.println("File telah ada");
                    }
                    FileWriter myWriters1 = new FileWriter("C:\\Users\\eliez\\Desktop\\Java Project\\uas\\segitiga.txt", true);
                    String stringdoubles1 = Double.toString(segitig.luas());
                    myWriters1.write("Luas Segitiga adalah " + stringdoubles1 + "\n");
                    myWriters1.close();
                    System.out.println("Successfully wrote to the file.");
                    break;

                case 4:
                    System.out.println("Perhitungan Layang-layang");
                    System.out.println("\nInput nilai alas: ");
                    double alas2 = input.nextDouble();
                    System.out.println("\nInput nilai tinggi: ");
                    double tinggi2 = input.nextDouble();
                    layang segitig2 = new layang(alas2, tinggi2);
                    System.out.println(segitig2.luas());

                    File myObk2 = new File("C:\\Users\\eliez\\Desktop\\Java Project\\uas\\layang.txt");
                    if (myObk2.createNewFile()) {
                        System.out.println("File created: " + myObk2.getName());
                    } else {
                        System.out.println("File telah ada");
                    }
                    FileWriter myWriters2 = new FileWriter("C:\\Users\\eliez\\Desktop\\Java Project\\uas\\layang.txt", true);
                    String stringdoubles2 = Double.toString(segitig2.luas());
                    myWriters2.write("Luas Segitiga adalah " + stringdoubles2 + "\n");
                    myWriters2.close();
                    System.out.println("Successfully wrote to the file.");
                    break;
                default:
                System.out.println("pilihan tidak valid, silakan ulangi program");
                    break;
            }
    
        } 
        catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
