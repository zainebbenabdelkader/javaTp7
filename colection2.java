package tp7;

abstract class Ustensile {
    protected int annee;

    public Ustensile(int annee) {
        this.annee = annee;
    }

    public abstract double getValeur();
}

abstract class Assiette extends Ustensile {
    public Assiette(int annee) {
        super(annee);
    }

    public abstract double getSurface();
}

class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }

    @Override
    public double getSurface() {
        return 3.14 * rayon * rayon;
    }

    @Override
    public double getValeur() {
        int age = 2019 - annee;
        if (age > 50) {
            return age - 50;
        }
        return 0;
    }
}

class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    @Override
    public double getSurface() {
        return cote * cote;
    }

    @Override
    public double getValeur() {
        int age = 2019 - annee;
        if (age > 50) {
            return 5 * (age - 50);
        }
        return 0;
    }
}

class Cuillere extends Ustensile {
    public Cuillere(int annee, double longueur) {
        super(annee);
    }

    @Override
    public double getValeur() {
        int age = 2019 - annee;
        if (age > 50) {
            return age - 50;
        }
        return 0;
    }
}

