public class DiscountFareStrategy implements FareStrategy {


    @Override
    public double calculateFare(double distance, double duration) {
        double perKm = 0.5;
        double perMin = 0.15;
        double fare = (perKm * distance) + (perMin * duration);
        return Math.max(fare, 3.00);
    }

}