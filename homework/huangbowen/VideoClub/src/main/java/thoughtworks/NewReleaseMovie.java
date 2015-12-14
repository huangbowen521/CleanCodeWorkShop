package thoughtworks;

public class NewReleaseMovie extends Movie {

    public static final double UNIT_PRICE = 3d;
    public static final int DAYS_EARN_POINTS = 1;

    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public Double getAmount(int daysRented) {
        return daysRented * UNIT_PRICE;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        int result = super.getFrequentRenterPoints(daysRented);

        if (daysRented > DAYS_EARN_POINTS) {
            result++;
        }

        return result;
    }
}
