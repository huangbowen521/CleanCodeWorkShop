package thoughtworks;

public class ChildrenMovie extends Movie {

    private static final double BASE_PRICE = 1.5d;
    private static final double UNIT_PRICE = 1.5d;

    private static final int BASE_DAYS_RENTED = 3;


    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public Double getAmount(int daysRented) {
        Double result = BASE_PRICE;
        if (daysRented > BASE_DAYS_RENTED) {
            result += (daysRented- BASE_DAYS_RENTED) * UNIT_PRICE;
        }

        return  result;
    }
}
