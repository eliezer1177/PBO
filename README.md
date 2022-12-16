
// player
class Player{
    String nama;
    double heal;
    int level;

    // object
    senjata senjata;
    armor armor;

    Player(String nama, double heal){
        this.nama = nama;
        this.heal = heal;
    }

    void serang(Player musuh){
        double attackpower = this.senjata.attackpower;
        System.out.println(this.nama + " serang " + musuh.nama + " dengan power " + attackpower);
        musuh.tahan(attackpower);

    }

    void tahan(double attackpower){
        double damage;
        if (this.armor.defencepower < attackpower){
            damage = attackpower - this.armor.defencepower;
        }else{
            damage = 0;
        }
        this.heal -= damage;
        System.out.println(this.nama + " kena damage "+ damage);
    }

    void gunasenjata(senjata senjata){
        this.senjata = senjata;
    }

    void gunaarmor(armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nnama: " + this.nama);
        System.out.println("health: " + this.heal + " hp" );
        this.armor.display();
        this.senjata.display();
    }
}

// senjata
class senjata {
    double attackpower;
    String nama;
    senjata(String nama, double attackpower){
        this.nama = nama;
        this.attackpower = attackpower;
    }
    void display(){
        System.out.println("senjata: " + this.nama + " , power: " + this.attackpower);
    }

}

// armor
class armor{
    double defencepower;
    String nama;
    armor(String nama ,double defencepower){
        this.defencepower = defencepower;
        this.nama = nama;
    }
    void display(){
        System.out.println("armor: " + this.nama + " , defend: " + this.defencepower);
    }
}

public class Perang {


    public static void main(String[] args) {
        
        Player player1 = new Player("ucup", 100);
        senjata senjata1 = new senjata("pedang",15);
        armor armor1 = new armor("baju" ,10);

        player1.gunasenjata(senjata1);
        player1.gunaarmor(armor1);
        player1.display();

        Player player2 = new Player("keke", 50);
        senjata senjata2 = new senjata("ketapel", 5);
        armor armor2 = new armor("adven", 1);

        player2.gunasenjata(senjata2);
        player2.gunaarmor(armor2);
        player2.display();


        System.out.println("\npertempuran");
        player1.serang(player2);
        player1.display();
        player2.display();

        System.out.println("\nepisode 2");
        player2.serang(player1);
        player1.display();
        player2.display();
    }       
    
}
