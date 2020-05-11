class Bank{
void fillForm(){
System.out.println("Please Enter the following details 1.Id, 2.Address");
}
void submitProof(String id, String address){
System.out.println("Customer's id is "+id+" and address is "+address);
}
long giveAccount(){
return 956658321;
}
String deposit(double amount){
System.out.println("Amount being deposited please hold for a moment");
String depositAmount = Double.toString(amount);
return depositAmount+"$ amount is deposited";
}
}
class Customer{
public static void main(String args[]){
Bank cust = new Bank();
cust.fillForm();
cust.submitProof("09100469","700 e ash ln, Euless, TX");
String accountNumber = Long.toString(cust.giveAccount());
System.out.println("Account created for Customer is "+ accountNumber);
System.out.println(cust.deposit(500.00));
}
}