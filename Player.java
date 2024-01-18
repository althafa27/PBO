package dasar;

public class Player {
    
    //definisi atribut
    protected String name;
    int speed;
    int healthPoin;
    int damage;
    int armor;
    
    //definisi method run
    void run (){
        System.out.println(name + "is running...");
        System.out.println("Speed: " + speed);
    }
    
    //definisi method isDead untuk mengecek nilai kesehatan (healthpoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
    //membuat attack untuk menyerang
    void attack(){
        System.out.print(name + " is attacking ");
        System.out.print("with damage " + damage);
    }
    
    //membuat pertahanan
    void defense(){
        System.out.println(name + " is detending ");
        System.out.print(" with shield " + armor + "%");
    }
}
