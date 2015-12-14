package thoughtworks;

public class TextStatement extends Statement {
    @Override
    public void addHeader(String customerName) {
        text.append(String.format("Rental record for %s\n", customerName));
    }

    @Override
    public void addFigure(String movieName, Double amount) {
        text.append(String.format("\t%s\t%s\n",movieName,amount));

    }

    @Override
    public void addFooter(Double totalAmount, int totalFrequentRenterPoints) {
        text.append(String.format("Amount owned is %s\nYou earned %s frequent renter points",totalAmount,totalFrequentRenterPoints));
    }
}
