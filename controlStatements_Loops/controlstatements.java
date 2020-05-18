class ControlStatements{
public static void main(String args[]){
int a =10;
int b = 12;
int c = 20;
if(a>b)
System.out.println("a is greater than b");
else
System.out.println("b is greater than a");
if(a>b){
if(a>c)
System.out.println("a is greater than b and c");
else
System.out.println("c is greater than a and b");
}
else
System.out.println("b is greater than a and c");

if(a>b)
System.out.println("a is greater than b");
else if(a>c)
System.out.println("a is greater than c");
else if(b>c)
System.out.println("b is greater than c");
else if(b>a)
System.out.println("b is greater than a");
else if(c>a)
System.out.println("c is greater than a");

}
}