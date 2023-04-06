import java.util.ArrayList;
public class CafeUtil{

    public int getStreakGoal(){
        int numWeeks = 10;
        int i = 0;
        int goal = 0;
        while(i <= numWeeks){
            goal+= i;
            i++;
        }
        return goal;    
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        
        for(int i = 0; i < prices.length; i++){
            total+=  prices[i];

            System.out.println(i);
        }
        return total;

    }

    void displayMenu(ArrayList<String> menu){
        for(String item : menu){
            System.out.println(item);
        }
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("Please Enter Your Name");
        String userName = System.console().readLine();
        System.out.println("hello," + userName);
        int customersAhead = customers.size();
        System.out.println("There are " + customersAhead + " people in front of you");
        customers.add(userName);

    }


}

