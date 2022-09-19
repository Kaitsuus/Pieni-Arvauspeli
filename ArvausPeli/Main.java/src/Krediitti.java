public class Krediitti {
    private int aloitus;
    
    public Krediitti(int aloitus) {
        this.aloitus = aloitus;
    }
    public int getAloitus() {
        return this.aloitus;
    }
    public int vahenna() {
        this.aloitus -= 5;
        return this.aloitus;
    }
    public int lisaa() {
        this.aloitus += 20;
        return this.aloitus;
    }
    public String saldo() {
        return "Krediittejä: " + this.aloitus;
    }
}
