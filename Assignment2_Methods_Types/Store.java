class Store{
void availableItems(){
System.out.println("Available items list is as follows .....");
}
void order(String itemName, int itemQuantity){
System.out.println("Item order is "+itemName+" no of units ordered is "+itemQuantity);
}
String orderProcessing(){
return "Order is Processed and ready to pay and pickup";
}
String pay(double amount){
System.out.println("Bill due is : "+amount+"$");
return "Bill Paid";
}
}
class Customer{
public static void main(String args[]){
Store cust = new Store();
cust.availableItems();
cust.order("Rice Bags",2);
String isOrderprocessed = cust.orderProcessing();
System.out.println(isOrderprocessed);
String isBillPaid = cust.pay(25.00);
System.out.println(isBillPaid);
} 
}