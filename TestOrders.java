import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item();
            item1.name = "mocah";
            item1.price = 23;

        Item item2 = new Item();
            item2.name = "latte";
            item2.price = 12;

        Item item3 = new Item();
            item3.name = "drip coffee";
            item3.price = 10;


        Item item4 = new Item();
            item4.name = "capuccino";
            item4.price = 6;

        


        Order order1 = new Order();
            order1.name = "Cindhuri";

            

        Order order2 = new Order();
            order2.name = "Jimmy";
            order2.total += item1.price;
            order2.items.add(item1);
            order2.ready= true;
            

        
        Order order3 = new Order();
            order3.name = "Noah"; 
            order3.total += item4.price;
            order3.items.add(item4);
            

        Order order4 = new Order();
            order4.name = "Sam";
            order4.total += item2.price;
            order4.items.add(item2);
            order4.total += item2.price;
            order4.items.add(item2); 
        



        // Menu items
    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order2.ready);
    }
}