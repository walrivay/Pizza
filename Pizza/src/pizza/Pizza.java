

package pizza;
/**
 * This class will have 3 properties: crust, toppings, and size
 * Add another method called eat, when you call the method, it will set a flag called 'eaten', which is a private property of the class
 * Also provide a method called 'print' -- when called it should print all the info about the pizza
 * Also provide a constructor that accepts: crust, toppings, and size
 * @author walrivay
 *
 */

public class Pizza {
	
	private String crust;
	private String toppings;
	private String size;
	private String eaten = "been eaten";
	
	public String getCrust() {return crust;}
	public String getToppings() {return toppings;}
	public String getSize() {return size;}
	public String getEaten() {return eaten;}
	
	public void setCrust(String crust) {this.crust = crust;}
	public void setToppings(String toppings) {this.toppings = toppings;}
	public void setSize(String size) {this.size = size;}
	public void setEaten(String eaten) {this.eaten = eaten;}
	
	public Pizza(String crust, String toppings, String size) {
		setCrust(crust);
		setToppings(toppings);
		setSize(size);
		
	}
	
	public String eat() {
		return eaten = "eaten";
	}

	public void print() {
		System.out.println("The crust of the pizza is " + getCrust() + ", the toppings on it are " + getToppings() + ", and it is " + getSize() + " size. It has " + getEaten() + ".");
	}
	
}

