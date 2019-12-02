public class Ship {
    // Déclaration d'attribut , pas de majuscule
    private KindShip kind;
    private Direction direc;
    private boolean isalive;
    private Coordinate x;
// ship is a collection of case
    // click droit généré constructeur

    // généré la constructeur pas defaut
    public Ship() {
}


    // généré le constructeur et paramétrer le constructeur
    public Ship(KindShip kind, Direction direc, boolean isalive,Coordinate x ) {
        this.kind = kind;
        this.direc = direc;
        this.isalive = isalive;
        this.x = x;
    }


    // ecrire nos méthode , ( fonction )
/*public boolean isalive ();{
    return
    }
*/






// générer les getteur et les setteur
    public KindShip getKind() {
        return kind;
    }

    public void setKind(KindShip kind) {
        this.kind = kind;
    }

    public Direction getDirec() {
        return direc;
    }

    public void setDirec(Direction direc) {
        this.direc = direc;
    }

    public boolean isIsalive() {
        return isalive;
    }

    public void setIsalive(boolean isalive) {
        this.isalive = isalive;
    }
}


