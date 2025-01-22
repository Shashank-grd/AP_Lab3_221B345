class One {
    public One(int x) {
        System.out.println("Parameterized constructor of class One: " + x);
    }
}

class Two extends One {
    public Two(int x) {
        super(x); // Explicitly call the parent class constructor
        System.out.println("Parameterized constructor of class Two: " + x);
    }
}


public class Main {
    public static void main(String[] args) {
        Two obj = new Two(10); 
    }
}
