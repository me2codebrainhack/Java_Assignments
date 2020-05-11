import java.util.Scanner;
class Square{
int a;
void input(){
System.out.println("Enter the side of square :");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
}
void area(){
System.out.println("Area of Square is : "+(a*a));
}
}
class Sum extends Square{
int b;
void accept(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
b = sc.nextInt();
}
void sum(){
System.out.println("Sum is : "+(a+b));
}
}
class Singleinheritance{
public static void main(String args[]){
Sum x = new Sum();
x.input();
x.area();
x.accept();
x.sum();
}
}