package thoughtworks;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VideoClubTest {
	protected Movie m0, m11, m12, m2;
	protected Customer c1;

	@Before
	public void setUp() {
		m11 = new NewReleaseMovie("Sky Captain");
		m12 = new NewReleaseMovie("Alejandro Magno");
		m0 = new RegularMovie("Accion Mutante");
		m2 = new ChildrenMovie("Hermano Oso");

		c1 = new Customer("Manuel");
	}

	@Test
	public void testAlquiler() {

		Rental r1 = new Rental(m11, 5);
		Rental r2 = new Rental(m0, 1);
		Rental r3 = new Rental(m2, 10);

		c1.addRental(r1);
		c1.addRental(r2);
		c1.addRental(r3);

		String salida = c1.statement();

		String salidaEsperada = new String("Rental record for Manuel\n"
				+ "\tSky Captain\t15.0\n" + "\tAccion Mutante\t2.0\n"
				+ "\tHermano Oso\t12.0\n" + "Amount owned is 29.0\n"
				+ "You earned 4 frequent renter points");

		assertThat(salidaEsperada,is(salida));

	}



    @Test
    public void shouldPriceZeroWhenRentNothing() {
        Customer customerRentingNothing = new Customer("Alfred");
        Assert.assertEquals("Rental record for Alfred\nAmount owned is 0.0\nYou earned 0 frequent renter points",
                customerRentingNothing.statement());
    }

    @Test
    public void shouldPriceTwoWhenRentRegularLessThan2Days() {
        Movie regularMovie = new RegularMovie("Regular movie");
        Rental newRental = new Rental(regularMovie, 2);
        Customer customerRentingNothing = new Customer("Alfred");
        customerRentingNothing.addRental(newRental);
        Assert.assertEquals("Rental record for Alfred\n\tRegular movie\t2.0\nAmount owned is 2.0\nYou earned 1 frequent renter points",
                customerRentingNothing.statement());
    }

    @Test
    public void shouldPriceFiveWhenRentRegular4Days() {
        Movie regularMovie = new RegularMovie("Regular movie");
        Rental newRental = new Rental(regularMovie, 4);
        Customer customerRentingNothing = new Customer("Alfred");
        customerRentingNothing.addRental(newRental);
        Assert.assertEquals("Rental record for Alfred\n\tRegular movie\t5.0\nAmount owned is 5.0\nYou earned 1 frequent renter points",
                customerRentingNothing.statement());
    }

    @Test
    public void shouldPriceNineWhenRentNewRelease2Days() {
        Movie regularMovie = new NewReleaseMovie("Regular movie");
        Rental newRental = new Rental(regularMovie, 3);
        Customer customerRentingNothing = new Customer("Alfred");
        customerRentingNothing.addRental(newRental);
        Assert.assertEquals("Rental record for Alfred\n\tRegular movie\t9.0\nAmount owned is 9.0\nYou earned 2 frequent renter points",
                customerRentingNothing.statement());
    }

    @Test
    public void shouldPriceOneAndHalfWhenRentChildrenLessThan3Days() {
        Movie regularMovie = new ChildrenMovie("Regular movie");
        Rental newRental = new Rental(regularMovie, 3);
        Customer customerRentingNothing = new Customer("Alfred");
        customerRentingNothing.addRental(newRental);
        Assert.assertEquals("Rental record for Alfred\n\tRegular movie\t1.5\nAmount owned is 1.5\nYou earned 1 frequent renter points",
                customerRentingNothing.statement());
    }

    @Test
    public void shouldPriceSixWhenRentChildren6Days() {
        Movie regularMovie = new ChildrenMovie("Regular movie");
        Rental newRental = new Rental(regularMovie, 6);
        Customer customerRentingNothing = new Customer("Alfred");
        customerRentingNothing.addRental(newRental);
        Assert.assertEquals("Rental record for Alfred\n\tRegular movie\t6.0\nAmount owned is 6.0\nYou earned 1 frequent renter points",
                customerRentingNothing.statement());
    }

    @Test
    public void shouldPriceSixWhenRentTwoRegulars4Days() {
        Movie regularMovie = new ChildrenMovie("Movie1");
        Rental newRental1 = new Rental(regularMovie, 4);
        Rental newRental2 = new Rental(regularMovie, 4);
        Customer customerRentingNothing = new Customer("Alfred");
        customerRentingNothing.addRental(newRental1);
        customerRentingNothing.addRental(newRental2);
        Assert.assertEquals("Rental record for Alfred\n\tMovie1\t3.0\n\tMovie1\t3.0\nAmount owned is 6.0\nYou earned 2 frequent renter points",
                customerRentingNothing.statement());
    }
}