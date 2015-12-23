package thoughtworks;


public class Application {

	public static void main(String[] arg) {
		Movie m1 = new RegularMovie("Sky Captain");
		Movie m2 = new RegularMovie("Alejandro Magno");
		Movie m3 = new NewReleaseMovie("Accion Mutante");
		Movie m4 = new ChildrenMovie("Hermano Oso");

		Customer c1 = new Customer("Manuel");

		Rental r1 = new Rental(m1, 5);
		Rental r2 = new Rental(m3, 1);
		Rental r3 = new Rental(m4, 10);

		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);

		System.out.println(c1.statement());

	}

}