package thoughtworks;
/**
 * Tema  Refactorizaciones
 * <p/>
 * Ejemplo de aplicaci�n de refactorizaciones. Actualizado para colecciones gen�ricas de java 1.5
 *
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos L�pez</A>
 * @version 1.1
 * @see java.io.File
 */

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String _name;
    private List<Rental> _rentals;

    public Customer(String name) {
        _name = name;
        _rentals = new ArrayList<Rental>();

    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        TextStatement statement = new TextStatement();
        return buildStatementBody(statement);
    }

    private String buildStatementBody(Statement statement) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        statement.addHeader(getName());

        for (Rental each : _rentals) {
            double thisAmount = each.getAmount();

            frequentRenterPoints += each.getFrequentRenterPoints();
            totalAmount += thisAmount;

            statement.addFigure(each.getMovie().getTitle(), thisAmount);
        }

        statement.addFooter(totalAmount, frequentRenterPoints);

        return statement.print();
    }
}
