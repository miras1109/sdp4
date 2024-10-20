public class PremiumFareStrategy implements FareStrategy {


    @Override
    public double calculateFare(double distance, double duration) {
        double perKm = 2.00;
        double perMin = 0.25;
        double fare = (perKm * distance) + (perMin * distance);
        return Math.max(fare, 5.00);

    }
}