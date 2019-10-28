
public class Car extends Vehicle {
	
    public Car(String newBrand, int newKilometers) {  
        super(newBrand, newKilometers);  
    }	
	
	
  @Override
  public String doStuff() {
	        return "Je suis " +this.getBrand() +" et je fais vroum vroum !" ;
	    }
	
}
