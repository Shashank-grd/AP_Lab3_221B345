public class Rum extends Decorator{
public Run(Offering offering){
	this.offering = offering;
}
    @Override
    String getName() {
        return "Rum" + offering.getName();
    }

	int getPrice(){
		return 15 +  offering.getPrice();
}

}