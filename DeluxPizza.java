package bill;

public class DeluxPizza extends Pizza{

	public DeluxPizza(Boolean veg) {
		super(veg);
		// TODO Auto-generated constructor stub
		//super.addExtraCheese();
		//super.addExtraToppings();
	}
	
	public void addExtraCheese() {
		
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		
		this.price += extraToppingsPrice;
	}
	

}
