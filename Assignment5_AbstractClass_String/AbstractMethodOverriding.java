abstract class Animal{
void breath(){
System.out.println("It breathes oxygen");
}
abstract void lifeSpan();
}
class Bear extends Animal{
void lifeSpan(){
System.out.println("Bear can live upto 50 years");
}
}
class Chicken extends Animal{
void lifeSpan(){
System.out.println("Chicken can live upto 3 years");
}
}
class AbstractMethodOverriding{
public static void main(String args[]){
Animal x;
x = new Bear();
x.breath();
x.lifeSpan();
x = new Chicken();
x.breath();
x.lifeSpan();
}
}