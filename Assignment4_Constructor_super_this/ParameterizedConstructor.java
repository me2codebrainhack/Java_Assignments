class Student{
int id;
float percentage;
String grade;
Student(int id, float percentage, String grade){
this.id = id;
this.percentage = percentage;
this.grade = grade;
}
void showStudentGrade(){
System.out.println("Student id : "+id+" with percentage: "+percentage+" got grade : "+grade);
}
}
class ParameterizedConstructor{
public static void main(String argss[]){
Student x = new Student(56,65,"B");
x.showStudentGrade();
}
}