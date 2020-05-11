import java.util.Scanner;
class Add{
void sum(int x, int y){
System.out.println("The sum of intergers is : "+(x+y));
}
void sum(float x, float y){
System.out.println("The sum of decimals is : "+(x+y));
}
}
class Methodoverloading{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a decimal value");
float a = sc.nextFloat();
System.out.println("Enter a decimal value");
float b =sc.nextFloat();
Add sum = new Add();
sum.sum(a,b);
}
}