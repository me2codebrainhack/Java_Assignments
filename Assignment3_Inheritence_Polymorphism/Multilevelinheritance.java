class Car{
void start(){
System.out.println("Car is started");
}
}
class Audi extends Car{
void audiFeatures(){
System.out.println("Audi features are displayed on dash board");
}
}
class Bmw extends Audi{
void bmwFeatures(){
System.out.println("Bmw features are displayed on dash board");
}
}
class Multilevelinheritance{
public static void main(String args[]){
Bmw Y = new Bmw();
Y.start();
Y.audiFeatures();
Y.bmwFeatures();
}
}