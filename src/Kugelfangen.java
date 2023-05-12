import GLOOP.*;
public class Kugelfangen {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private Box dieBox;
    private Kugel[] kugel;
    private Spielfeld spielfeld;

    public Kugelfangen() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 700, 900);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/donnisad.jpg");
        tastatur = new GLTastatur();

        spielfeld = new Spielfeld(1000, 1000);

        dieBox = new Box();

        kugel = new Kugel[50];
        for (int i = 0; i < kugel.length; i++) {
            kugel[i] = new Kugel(spielfeld, dieBox);
        }

        samba();
    }

    public void samba() {
        while (!tastatur.esc()) {
            if(tastatur.links()){
                dieBox.bewegeLinks();
            }
            if(tastatur.rechts()){
                dieBox.bewegeRechts();
            }
            if(tastatur.oben()){
                dieBox.bewegevorne();
            }
            if(tastatur.unten()){
                dieBox.bewegehinten();
            }
            Sys.warte();
            }
        Sys.beenden();
    }
}


