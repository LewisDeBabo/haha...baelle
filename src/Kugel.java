import GLOOP.*;
public class Kugel{
    private GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;
    
    private double radius;
    private boolean istAktiv;
    private double vX, vZ;

    public Kugel(){
        kugel = new GLKugel(0,0,0,25,"src/img/donniface.jpg");
    }

}
