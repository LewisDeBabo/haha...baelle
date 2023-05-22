import GLOOP.*;
public class Kugelfangen {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;
    private GLTafel schwoffel;

    public int pungte = 0;

    private Box dieBox;
    private Kugel[] kugel;
    private Spielfeld spielfeld;
    int tiefe = 1000;
    int breite = 1000;

    public Kugelfangen() {
        kamera = new GLEntwicklerkamera();
        kamera.setzePosition(0, 700, 900);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/donnisad.jpg");
        tastatur = new GLTastatur();

        spielfeld = new Spielfeld(breite, tiefe);

        dieBox = new Box();

        kugel = new Kugel[200];
        for (int i = 0; i < kugel.length; i++) {
            kugel[i] = new Kugel(spielfeld, dieBox);
        }

        samba();
    }

    public void samba() {
        schwoffel = new GLTafel(0, 100, -600-tiefe/2, -breite/4, breite/4);
        schwoffel.setzeText("Pungte: " + pungte,100);
        while (!tastatur.esc()) {
            if (tastatur.links() && dieBox.gibX() > -breite/2 +40) {
                dieBox.bewegeLinks();
            }
            if (tastatur.rechts() && dieBox.gibX() < breite/2 -40) {
                dieBox.bewegeRechts();
            }
            if (tastatur.oben() && dieBox.gibZ() > -tiefe/2 +40) {
                dieBox.bewegevorne();
            }
            if (tastatur.unten() && dieBox.gibZ() < tiefe/2 -40) {
                dieBox.bewegehinten();
            }

            for (int i = 0; i < kugel.length; i++) {
                if (kugel[i].getroffen()) {
                    pungte++;
                }
                kugel[i].lightningMcQueen_rooh_beer();
            }
            schwoffel.setzeText("Punkte: " + pungte,100);


            Sys.warte();
        }
        Sys.beenden();
    }
}



