import GLOOP.*;
public class Kugel{
    private GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;
    
    private double radius;
    private boolean istAktiv;
    private double vX, vZ;

    public Kugel(Spielfeld pSpielfeld, Box pBox){
        kugel = new GLKugel(0,20,0,15,"src/img/donniface.jpg");
        feld = pSpielfeld;
        dieBox = pBox;
    }

    public void move(){
        kugel.verschiebe(0,0,0);
    }

}
