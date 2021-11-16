package BoksMaci;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 10, 1000, 90, 50);
        Fighter alex = new Fighter("Alex", 10, 950, 100, 50);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}


