public class Affen {
    //Field
    int beine;
    int arme;
    String name;
    static int ZaehleObjects; //Klassenvaribale


    public Affen(int beine, int arme, String name){

        this.beine = beine; //Instanzvariablen
        this.arme = arme;
        this.name = name;
        ZaehleObjects++;

    }

    void MehrArme (){  //Instanzmethode
        arme+=20;
    }

    static double teile(double a, int b){ //Klassenmethode
        return a/b;
    }


    public static void main(String[] args) {
        Affen hubert = new Affen(2, 2, "Hubert");
        System.out.println(ZaehleObjects);
        Affen hubertine = new Affen(2, 2, "Hubertine");
        System.out.println(ZaehleObjects);
        System.out.println(hubert.arme);
        hubert.MehrArme();
        System.out.println(hubert.arme);
        System.out.println(teile(12.0, 4));
    }


}
