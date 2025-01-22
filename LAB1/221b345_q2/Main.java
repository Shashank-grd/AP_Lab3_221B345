import classes.*;

public class Main {
    public static void main(String[] args) {
        Mother ob = new Mother(); // Object of Mother class
        ob.show(); 

        Child ob2 = new Child(); // Object of Child class
        ob2.show();

       
        Mother ob3 = new Child(); 
        ob3.show(); 
    }
}