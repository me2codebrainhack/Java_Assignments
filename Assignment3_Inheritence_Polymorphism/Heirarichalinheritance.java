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
class Bmw extends Car{
void bmwFeatures(){
System.out.println("Bmw features are displayed on dash board");
}
}
class Heirarichalinheritance{
public static void main(String args[]){
Audi x = new Audi();
x.start();
x.audiFeatures();
Bmw Y = new Bmw();
Y.start();
Y.bmwFeatures();
}
}