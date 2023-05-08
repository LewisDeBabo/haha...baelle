import GLOOP.*;
public class Spielfeld{
    private GLQuader untergrund,w1,w2,w3,w4;

    private double breite, tiefe;

    public Spielfeld(double pBreite, double pTiefe){
        breite = pBreite;
        tiefe = pTiefe;
        untergrund = new GLQuader(0,0,0, breite,20,tiefe);
        untergrund.setzeTextur("src/img/donnih.jpg");

        w1 = new GLQuader(0,0,breite/2,50,200,500+breite/2,"src/img/cobalt.jpg");
        w1.drehe(0,90,0);

        w2 = new GLQuader(0,0,-breite/2,50,200,500+breite/2,"src/img/cobalt.jpg");
        w2.drehe(0,90,0);

        w3 = new GLQuader(tiefe/2,0,0,50,200,500+tiefe/2,"src/img/cobalt.jpg");

        w4 = new GLQuader(-tiefe/2,0,0,50,200,500+tiefe/2,"src/img/cobalt.jpg");
    }
}
