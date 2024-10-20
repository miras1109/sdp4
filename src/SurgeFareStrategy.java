public class SurgeFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double distance, double duration) {
        double perKm = 2.00;
        double perMin = 0.5;
        double fare = (perKm * distance) + (perMin * duration);
        return Math.max(fare, 10.00);

    }
}