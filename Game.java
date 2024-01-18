package dasar;

public class Game {
    public static void main(String[] args) {
        
        // membuat objek player
        Player petani = new Player();
        
        //mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 1;
        petani.damage = 50;
        petani.armor = 80;
        
        //menjalankan method
        petani.run();
      
        petani.attack();
        petani.defense();
        
        if (petani.isDead()){
            System.out.println("Game Over!");
        }else{
            System.out.println("masih hidup");
        }
    }
}
