package thoughtworks;

public class RegularMovie extends Movie {


    public static final double BASE_PRICE = 2d;
    public static final int BASE_DAYS_RENTED = 2;
    public static final double UNIT_PRICE = 1.5d;

    public RegularMovie(String title) {
        super(title);
    }


    @Override
    public Double getAmount(int daysRented) {

        Double result = BASE_PRICE;
        if (daysRented > BASE_DAYS_RENTED) {
            result += (daysRented - BASE_DAYS_RENTED) * UNIT_PRICE;
        }

        return result;
    }
}
