package main;

import java.util.Random;


public class CsigaversenyJatek  extends Jatek{
    
    
    public CsigaversenyJatek(){
        
    }
    
    
    @Override
    void start(){

        super.start();
        System.out.println("Elindult a csigaverseny játék!");
        
        Csiga csiga1 = new Csiga();
        csiga1.szin = "Piros";
        csiga1.lepes = csiga1.lepes();
        
        Csiga csiga2 = new Csiga();
        csiga2.szin = "Zöld";
        csiga2.lepes = csiga2.lepes();

        
        Csiga csiga3 = new Csiga();
        csiga3.szin = "Kék";
        csiga3.lepes = csiga3.lepes();
        
        int[] tomb = {csiga1.lepes, csiga2.lepes, csiga3.lepes};
        
}
    int gyorsit(int[] tomb){
        Random rnd = new Random();
        int szam = rnd.nextInt(1,101);
        if (szam <= 20){
            int kivalasztottCsiga = rnd.nextInt(0,3);
            return tomb[kivalasztottCsiga] = tomb[kivalasztottCsiga]*2;
        }else{
            return 0;
        }
        
    }

}

   