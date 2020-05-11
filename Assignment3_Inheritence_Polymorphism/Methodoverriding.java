class Car{
void cost(){
}
void milage(){
}
}
class Audi extends Car{
void cost(){
System.out.println("Audi cost is somewhere between 40k to 70k");
}
void milage(){
System.out.println("Audi milage is somewhere between 10mph to 20mph");
}
}
class Bmw extends Car{
void cost(){
System.out.println("Bmw cost is somewhere between 50k to 90k");
}
void milage(){
System.out.println("Bmw milage is somewhere between 8mph to 15mph");
}
}
class Methodoverriding{
public static void main(String args[]){
Car x = new Audi();
x.cost();
x.milage();
x = new Bmw();
x.cost();
x.milage();
}
}