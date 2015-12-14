package thoughtworks;

public abstract class Statement {

    StringBuilder text = new StringBuilder();

    public abstract void addHeader(String custoemrName);

    public abstract void addFigure(String movieName, Double amount);

    public abstract void addFooter(Double totalAmount, int totalFrequentRenterPoints);

    public String print() {
        return text.toString();
    }

}
