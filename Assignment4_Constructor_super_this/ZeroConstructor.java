class Student{
int id;
float percentage;
String grade;
Student(){
id = 45;
percentage= 75;
grade = "A";
}
void showStudentGrade(){
System.out.println("Student id : "+id+" with percentage: "+percentage+" got grade : "+grade);
}
}
class ZeroConstructor{
public static void main(String argss[]){
Student x = new Student();
x.showStudentGrade();
}
}