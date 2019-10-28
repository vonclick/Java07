
public abstract class Vehicle {

	private String brand;
	private int kilometers;
	
	
	// Methode Abstraite
	 public abstract String doStuff();
	
	// Contructeur
	public Vehicle (String newBrand, int newKilometers) {
		this.brand = newBrand;
		this.kilometers = newKilometers;
	}
	
	// Setters
	public void setBrand (String newBrand) {
		this.brand = newBrand;
	}
	
	public void setKilometers (int newKilometers) {
		this.kilometers = newKilometers;
	}
	
	// Getters	
    public String getBrand() {  
        return this.brand ;  
    }  	
	
    public int getKilometers() {  
        return this.kilometers ;  
    }  
}
