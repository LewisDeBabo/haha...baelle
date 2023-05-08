import GLOOP.*;
public class Box{
    GLQuader quader;
    double pX,pZ;
    double breite, tiefe;

    public Box() {
        quader = new GLQuader(0,0,0,100,50,200);
        quader.setzeFarbe(1,0,0);
        quader.setzeTextur("src/img/weepingbell.png");
    }
    public void bewegeLinks(){
        quader.verschiebe(-1.5,0,0);
    }
    public void bewegeRechts(){
        quader.verschiebe(1.5,0,0);
    }
    public void bewegevorne(){
        quader.verschiebe(0,0,-1.5);
    }
    public void bewegehinten(){
        quader.verschiebe(0,0,1.5);
    }

    public double gibX(){
        return quader.gibX();
    }
    public double gibY(){
        return quader.gibY();
    }
    public double gibZ(){
        return quader.gibZ();
    }
}