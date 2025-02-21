public class Test {
    public static void main(String[] args) {
        Offering offering=new Coffee();
	offering = new Rum(offering);
	System.out.print{offering.getName()+ " " + offering.getPrice()};
    }
}
