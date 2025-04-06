package bill;

import java.util.Scanner;

public class Pizza {
	protected int price;
	private boolean veg;
	
	 protected int extraCheesePrice=100;
	 protected int extraToppingsPrice=150;
	 protected int backPackPrice=20;
	 
	protected int basePizzaPrice;
	  

	 private boolean isExtraCheeseAdded=false;
	 private boolean isExtraToppingsAdded=false;
	 private boolean isOptedForTakeaway=false;
	 
	 Scanner in = new Scanner(System.in);
	 
	public Pizza(Boolean veg)
	{
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese()
	{
		System.out.println("Extra Cheese(Y/N)? => ");
		char ch =in.next().charAt(0);
		switch(ch) {
		case ('y'):
			isExtraCheeseAdded = true;
			this.price += extraCheesePrice;
			break;
		case ('n'):
			isExtraCheeseAdded = false;
			break;
		}
	}
	
	public void addExtraToppings()
	{
		System.out.println(" Want Extra Topping(Y/N)? => ");
		char ch =in.next().charAt(0);
		switch(ch) {
		case ('Y'):
			isExtraToppingsAdded=true;
			this.price += extraToppingsPrice;
			break;
		case ('N'):
			isExtraToppingsAdded=false;
			break;
		}
	}
	public void takeAway()
	{
		System.out.println(" Want Takeaway(Y/N)? => ");
		char ch =Character.toLowerCase(in.next().charAt(0));
		switch(ch) {
		case ('Y'):
			isOptedForTakeaway=true;
			this.price += backPackPrice;
			break;
		case ('N'):
			isOptedForTakeaway=false;
			break;
		}
	}
	public void getBill() {
		String bill= " ";
		System.out.println("Pizza:"+basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill +="Extra Chesse:"+extraCheesePrice+"\n";
		}
		if(isExtraToppingsAdded) {
			bill +="Extra Toppings:"+extraToppingsPrice+"\n";
		}
		if(isOptedForTakeaway) {
			bill +="Take Away:"+backPackPrice+"\n";
		}
		bill += "\nTotal Amount:"+this.price;
		System.out.println(bill);
		System.out.println("\\n\\n\\nTHANK YOU!!! VISIT AGAIN...");
		System.out.println("-------------------------------------------------");
	}

}
