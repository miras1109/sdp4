public class Main {
    public static void main(String[] args) {
        FareStrategy discountStr = new DiscountFareStrategy();
        FareStrategy premiumStr = new PremiumFareStrategy();
        FareStrategy regularStr = new RegularFareStrategy();
        FareStrategy surgeStr = new SurgeFareStrategy();

        RideContext rideContext = new RideContext(regularStr);

        rideContext.setStrategy(regularStr);
        System.out.println("Regular Fare: " + rideContext.calculateFare(15, 20, false));

        rideContext.setStrategy(premiumStr);
        System.out.println("Premium Fare: " + rideContext.calculateFare(15, 20, false));

        rideContext.setStrategy(discountStr);
        System.out.println("Discount Fare: " + rideContext.calculateFare(15, 20, false));

        rideContext.setStrategy(surgeStr);
        System.out.println("Surge Fare (Peak Hour): " + rideContext.calculateFare(15, 20, true));

        try {
            System.out.println(rideContext.calculateFare(-10, 15, false));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
