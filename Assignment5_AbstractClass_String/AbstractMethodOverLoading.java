abstract class Restaurant{
abstract void takeOrder(String order1, String order2, String order3);
abstract void takeOrder(String order1, String order2);
abstract void takeOrder(String order1);
}
class indianDhabha extends Restaurant{
void takeOrder(String order1, String order2, String order3){
System.out.println("Price for combo of "+order1+" "+order2+" "+order3+" is 20$");
}
void takeOrder(String order1, String order2){
System.out.println("Price for combo of "+order1+" "+order2+" is 10$");
}
void takeOrder(String order1){
System.out.println("Price for "+order1+" is 5$");
}
}
class OnlineCustomer{
public static void main(String args[]){
Restaurant x = new indianDhabha();
x.takeOrder("idli","vada","chai");
x.takeOrder("GobiManchuria","Coke");
x.takeOrder("Falooda");
}
}