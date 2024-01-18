package dasar;

public class Terbang {
    public static void main(String[] args) {
        
        Drone terbang = new Drone();
        
        terbang.merek = "Loyal";
        terbang.ketinggian = 30;
        terbang.kecepatan = 20;
        terbang.energi = 5;
        
      
            
        terbang.terbang();
        
        
        terbang.maju();
        terbang.belok();  
        terbang.turun();
        terbang.matikanMesin();
    }
}
