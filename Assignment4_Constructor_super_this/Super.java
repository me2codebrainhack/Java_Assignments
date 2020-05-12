class Bank{
double balance;
Bank(){
balance = 500;
}
}
class Atm extends Bank{
void showBalance(){
System.out.println("Account balance is: "+super.balance);
}
}
class Super{
public static void main(String arg[]){
Atm x = new Atm();
x.showBalance();
}
}