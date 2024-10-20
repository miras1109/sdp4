public class RideContext {

    private FareStrategy strategy;

    public RideContext(FareStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(FareStrategy strategy) {
        this.strategy = strategy;
    }
    public double calculateFare(double distance, double duration, boolean isPeak) {
        if (distance < 0 || duration < 0) {
            throw new IllegalArgumentException("distance < 0, duration < 0");
        }
        if (isPeak == true) {
            this.setStrategy(new SurgeFareStrategy());
        }
        return this.strategy.calculateFare(distance, duration);
    }
}