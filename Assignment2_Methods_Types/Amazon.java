class Amazon{
void welcome(){
System.out.println("Welcome to Amazon we hope you find everything here! Happy Shopping!!!");
}
void search(String itemName){
System.out.println("The following item "+itemName+" is available and the price is 50.00 $");
}
String addToCart(){
return "Item is added to cart proceed to checkout";
}
String checkout(double amount){
return "The amount paid is "+amount+" and item will be shipped in 2 days. Thanks and Enjoy";
}
}
class Customer{
public static void main(String args[]){
Amazon cust = new Amazon();
cust.welcome();
cust.search("Cricket Bat");
String isAddedToCart = cust.addToCart();
System.out.println(isAddedToCart);
String isBillPaid = cust.checkout(50.00);
System.out.println(isBillPaid);
}
}