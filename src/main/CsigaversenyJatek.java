package main;

import java.util.Random;
import java.util.Scanner;


public class CsigaversenyJatek  extends Jatek{
    
    
    public CsigaversenyJatek(){
        
    }
    
    
    @Override
    void start(){
        Scanner sc = new Scanner(System.in);


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
        
        String RED = "\u001B[31m";
        String BLUE = "\u001B[34m";
        String GREEN = "\u001B[32m";
        
        System.out.printf(RED+"1.%-6s|🐌\n"+GREEN+"2.%-6s|🐌\n"+BLUE+"3.%-6s|🐌\n",csiga1.szin,csiga2.szin,csiga3.szin);
        System.out.print("Melyik csigára fogadsz? Add meg a sorszámát (1-3): ");
        int fogadas = sc.nextInt()-1;
        
        System.out.println("Első kör:");
        
        int[] allas = {0,0,0};
        allas[0] += tomb[0];
        allas[1] += tomb[1];
        allas[2] += tomb[2];
        System.out.println(csiga1.lepes + " "+ csiga2.lepes + " " +csiga3.lepes + " ");
        
        String csiga1Allas = RED + "";
        for (int i = 0; i < allas[0]-1; i++) {
            csiga1Allas += "_";
        }
        csiga1Allas += "🐌";
        System.out.println(csiga1Allas);
        
        String csiga2Allas = GREEN + "";
        for (int i = 0; i < allas[1]-1; i++) {
            csiga2Allas += "_";
        }
        csiga2Allas += "🐌";
        System.out.println(csiga2Allas);
        
        String csiga3Allas = BLUE + "";
        for (int i = 0; i < allas[2]-1; i++) {
            csiga3Allas += "_";
        }        
        csiga3Allas += "🐌";
        System.out.println(csiga3Allas);

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

   