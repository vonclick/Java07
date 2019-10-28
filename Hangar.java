
public class Hangar {

	public static void main(String[] args) {

		// Références vers des instances des classes Car et Boat 
		Car maVoiture  = new Car("BMW", 280);
		Boat monBateau = new Boat("Shark Boat", 80);
		
		// Résultat de l'appel de la méthode doStuff()
		System.out.println( maVoiture.doStuff() );
		System.out.println( monBateau.doStuff() );		

	}

}
