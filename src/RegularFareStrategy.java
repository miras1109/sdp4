public class RegularFareStrategy implements FareStrategy {


    @Override
    public double calculateFare(double distance, double duration) {
        double perKm = 1.00;
        double perMin = 0.25;
        double fare = (perKm * distance) + (perMin * duration);
        return Math.max(fare, 2.00);

    }

}