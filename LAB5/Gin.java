public class Gin extends Decorator{
public Gin(Offering offering){
	this.offering = offering;
}
    @Override
    String getName() {
        return "Gin" + offering.getName();
    }

	int getPrice(){
		return 10 +  offering.getPrice();
}

}