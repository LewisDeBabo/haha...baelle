import GLOOP.*;
public class Kugel{
    private GLKugel kugel;
    private Box dieBox;
    private Spielfeld feld;

    private double radius;
    double xspeed, zspeed;
    double abstand;
    private double vX, vZ;

    public Kugel(Spielfeld pSpielfeld, Box pBox){
        kugel = new GLKugel(0,20,100,15,"src/img/donniface.jpg");
        xspeed = Math.random() * 2 - 1;
        zspeed = Math.random() * 2 - 1;
        kugel.verschiebe(0, 20, 0);
        feld = pSpielfeld;
        dieBox = pBox;
    }

    public void lightningMcQueen_rooh_beer() {
        if(getroffen()){
            kugel.setzePosition(-1000000,-1000000,0);
        }
        if(-feld.gibtiefe()/2>= kugel.gibZ()-20||+feld.gibtiefe()/2<= kugel.gibZ()+20){
            zspeed = -zspeed;
        }
        if(-feld.gibbreite()/2>= kugel.gibX()-20||+feld.gibbreite()/2<= kugel.gibX()+20){
            xspeed = -xspeed;
        }
        kugel.drehe(0, Math.random() * 2 - 0.75, 0);
        kugel.verschiebe(xspeed, 0, zspeed);

    }

    public boolean getroffen() {
        abstand = Math.sqrt(Math.pow(kugel.gibX() - dieBox.gibX(), 2)
                 +Math.pow(kugel.gibZ() - dieBox.gibZ(), 2));
        if (abstand < 60) {
            return true;
        } else {
            return false;
        }

    }
}
//