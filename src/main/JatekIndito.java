package main;

public class JatekIndito {
    
    public static void main(String[] args) {
        /* nincs referencia az objektumra: */
        //new Kitalalosjatek().start();
        
        /* adunk referenciát az objektumra: */
        //Jatek referencia = new Kitalalosjatek();
        /* a referencián keresztül elérjük az objektum tagfüggvényeit: */
        //referencia.start();
        
        /* nincs referencia, csak az objektum konstruktorát hívjuk: */
//        new Kitalalosjatek();
//        new CsigaversenyJatek();
//        
        /* 3 játékos 1-1 tippel */
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        new Jatekos().tippel();
        
        /* 1 játékos tippel háromszor */
//        Jatekos jatekos1 = new Jatekos();
//        jatekos1.tippel();
//        jatekos1.tippel();
//        jatekos1.tippel();

//        poliformizmus az öröklés felhasználásával
        Jatek kitalalos= new Kitalalosjatek();
        Jatek csigas = new CsigaversenyJatek();
        
        Jatek[] jatekok ={kitalalos, csigas};
//        bekérhetnénk, hogy melyik játékot inditsuk el. 
//        vagy minden játékot
        for (Jatek jatek:jatekok){
//            hibás tervezés, nincs közös metódus
//            if(jatek instanceof Kitalalosjatek)
//            {        ((Kitalalosjatek)jatek).start();
//            }else if (jatek instanceof CsigaversenyJatek){
//                ((CsigaversenyJatek)jatek).start();
//            }
        jatek.start();
    
        }

    }
}
