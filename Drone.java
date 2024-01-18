package dasar;

class Drone {
    // atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    //method
    void terbang(){
        energi--;
        if (energi > 10){
            // terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone terbang...");
    }else{
            System.out.println("Energi lemah: drone ngga bisa terbang");
        }
    }
void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin  tidak bisa dimatikan karena sedang terbang");
        }else{
            System.out.println("Mesin dimatikan...");
        }
    }

void turun(){
    //ketinggian berkurang kateena turun
    ketinggian--;
    energi--;
    System.out.println("Drone turun");
    }

void belok(){
    energi--;
    System.out.println("Drone belok");
    //belok ke mana? perlu di cek :)
}

void maju(){
    energi--;
    System.out.println("Drone maju ke depan");
    kecepatan++;
}

void mundur(){
    energi--;
    System.out.println("Drone mundur");
    kecepatan++;
}
    }

