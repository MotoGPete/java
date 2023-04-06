public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.5;
        double lattePrice = 4.99;
        double cappuccinoPrice = 3.99;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); 
        System.out.println(customer1 + pendingMessage); 
        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4 == true) {
            System.out.println(displayTotalMessage + cappuccinoPrice);

        } else {
            System.out.println(pendingMessage);
        }
        
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(generalGreeting + customer2);
        System.out.println(customer2 + "s total is " + (lattePrice * 2));
        if(isReadyOrder2 == true){
            System.out.println(readyMessage + customer2);
        }else {
            System.out.println(pendingMessage + customer2);
        }
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + dripCoffeePrice);
        System.out.println(displayTotalMessage + (dripCoffeePrice - lattePrice));

    }
}
