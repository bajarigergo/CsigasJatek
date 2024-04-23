
package main;

import java.util.Random;

public class Csiga {
    int lepes;
    String szin;
    Random rnd = new Random();
    
    int lepes(){
        lepes = rnd.nextInt(0, 4);
        return lepes;
    }
}
