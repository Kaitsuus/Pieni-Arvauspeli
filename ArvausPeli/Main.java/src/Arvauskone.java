public class Arvauskone {
    private int min;
    private int max;
    private int random;

    public Arvauskone() {
        this.min = 1;
        this.max = 50;
    }
    public int random() {
        this.random = (int)Math.floor(Math.random()*(max - min + 1) + min);
        return this.random;
    }
    public int newRandom() {
        this.random = (int)Math.floor(Math.random()*(max - min + 1) + min);
        return this.random;
    }
    public int setRandom() {
        return this.random;
    }

    
    
    
}

