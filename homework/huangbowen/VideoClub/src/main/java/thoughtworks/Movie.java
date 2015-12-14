package thoughtworks;/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones
 * gen�ricas de java 1.5
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public abstract class Movie {

	private String _title;
    private static final int BASE_RENTER_POINTS = 1;

    public Movie(String title) {
		_title = title;
	}

	public String getTitle() {
		return _title;
	}

	public abstract Double getAmount(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
        return BASE_RENTER_POINTS;
	}
}

