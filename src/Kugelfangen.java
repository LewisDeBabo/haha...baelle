import GLOOP.*;
public class Kugelfangen {
    private GLKamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLTastatur tastatur;

    private Box dieBox;
    private Kugel[] kugel;

    public Kugelfangen() {
        kamera = new GLKamera();
        kamera.setzePosition(0, 700, 900);

        licht = new GLLicht();
        himmel = new GLHimmel("src/img/donnisad.jpg");
        tastatur = new GLTastatur();

        Spielfeld spielfeld = new Spielfeld(1000, 1000);
        Box dieBox = new Box();

        fuehreAus();
    }

    public void fuehreAus() {

    }
}

