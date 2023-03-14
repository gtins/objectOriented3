public abstract class Planeta {
    public abstract String getNome();
    public abstract double getGravidade();
    public double getPeso (double peso) {
        return peso * getGravidade();
    }
}