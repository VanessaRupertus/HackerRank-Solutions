/*
In this problem, you are given an interface Food. There are two classes Pizza and
Cake which implement the Food interface, and they both contain a method getType().

The main function in the Main class creates an instance of the FoodFactory class.
The FoodFactory class contains a method getFood(String) that returns a new instance
of Pizza or Cake according to its parameter.

You are given the partially completed code in the editor. Please complete the FoodFactory class.
 */
interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        if (order.equals("cake")) {
            Cake cake = new Cake();
            return cake;
        }
        else {
            Pizza pizza = new Pizza();
            return pizza;
        }
    }
}