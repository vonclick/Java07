
public class Boat extends Vehicle{
	
    public Boat(String newBrand, int newKilometers) {  
        super(newBrand, newKilometers);  
    }	
	
	
  @Override
  public String doStuff() {
	        return "Je suis " +this.getBrand() +" et je fais glou glou !" ;
	    }
}
