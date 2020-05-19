/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabaa;

public class Arabaa {
protected int ahız=0; // Anlık hız
private String renk = "siyah";
private boolean durum=false; // Çalışmama durumu

public void calıs(int Hız){
    durum=true;
    if(durum==true)
        ahız = ahız + Hız;
}

public void dur(){
    if(durum==true){
        ahız = 0;
        durum=false;
    }
}

public void goster(){
    System.out.println("Çalışma:" +durum+ " Hızı:" +ahız);
    System.out.println("Rengi:" +renk);
}

// Alt sınıflar
class Otomobil extends Arabaa{
    public void hızlıGit(){
        ahız = ahız + 50;
        System.out.println("Şu anki hızı:"+ ahız);
    }
}

class Minibus extends Arabaa{
    public void hızlıGit(){
        ahız = ahız + 50;
        System.out.println("Şu anki hızı:"+ ahız);
    }
}

    public static void main(String[]args){
        //Alt sınıflardan nesneler 
        Otomobil oto = new Arabaa().new Otomobil();
        Minibus min = new Arabaa().new Minibus();
        
       //otobüs
       oto.calıs(20);
       oto.goster();
       oto.hızlıGit();
       //minibus
       min.calıs(10);
       min.goster();
       min.dur();
       min.goster();
       
}
}

    



