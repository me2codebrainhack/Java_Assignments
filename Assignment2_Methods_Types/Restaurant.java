class Restaurant{
void menu(){
System.out.println("1.Starters, 2.Main Course, 3.Desert");
}
void takeOrder(String Order){
System.out.println("Order given is "+ Order);
}
String serveFood(){
return "Starters";
}
String payBill(double amount){
System.out.println("Amount for food is "+ amount);
return "paid";
}
}

class Customer{
public static void main(String[] args){
Restaurant helloindia = new Restaurant();
helloindia.menu();
helloindia.takeOrder("Starters");
System.out.println(helloindia.serveFood());
String isPaid = helloindia.payBill(55.29);
System.out.println("Bill is "+isPaid);
}
}