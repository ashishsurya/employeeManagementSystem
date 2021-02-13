package employeeManagmentSystem;


public class Mess {
  private Food foodItems[];
  public Mess() {
    foodItems[0] = new Food("Chapathi");
    foodItems[1] = new Food("Biryani");
    foodItems[2] = new Food("Idly");
  }
  public void getFoodItems() {
    System.out.println("Item name : " + foodItems[0]);
    System.out.println("Item count : " + foodItems[1]);
    System.out.println("Item count : " + foodItems[2]);
  }
}
