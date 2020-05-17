import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
class Employee{

public int empNo;
public String empName;
public String joinDate;
public char designationCode;
public String department;
public int basic;
public int hra;
public int it;

Employee(int empNo, String empName, String joinDate, char designationCode, String department, int basic, int hra, int it){
this.empNo = empNo;
this.empName = empName;
this.joinDate = joinDate;
this.designationCode = designationCode;
this.department = department;
this.basic = basic;
this.hra = hra;
this.it = it;
}
}
class DA{
public char designationCode;
public String designation;
public int da;

DA(char designationCode, String designation, int da){
this.designationCode = designationCode;
this.designation = designation;
this.da = da;
}
}

class Project1{
public static void main(String args[]){
int input = 1001;
int empIndex=0;
int daIndex=0;
char dc=' ';
String designation = null;
int salary=0;
boolean argsFlag = false;

//input = Integer.parseInt(args[0]);

inputCorrect.put("1001", new Boolean(true));
inputCorrect.put("1002", new Boolean(true));
inputCorrect.put("1003", new Boolean(true));
inputCorrect.put("1004", new Boolean(true));
inputCorrect.put("1005", new Boolean(true));
inputCorrect.put("1006", new Boolean(true));
inputCorrect.put("1007", new Boolean(true));
Employee[] empArray;
empArray = new Employee[7];
empArray[0] = new Employee(1001,"Ashish","01/04/2009",'e',"R&D",20000,8000,3000); 
empArray[1] = new Employee(1002,"Sushma","23/08/2012",'c',"PM",30000,12000,9000);
empArray[2] = new Employee(1003,"Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
empArray[3] = new Employee(1004,"Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
empArray[4] = new Employee(1005,"Ranjan","16/07/2005",'m',"Engg",50000,20000,20000);
empArray[5] = new Employee(1006,"Suman","1/1/2000",'e',"Manufacturing",23000,9000,4400);
empArray[6] = new Employee(1007,"Tanmay","12/06/2006",'c',"PM",29000,12000,10000);
DA[] allowArray;
allowArray = new DA[5];
allowArray[0] = new DA('e',"Engineer",20000);
allowArray[1] = new DA('c',"Consultant",32000);
allowArray[2] = new DA('k',"Clerk",12000);
allowArray[3] = new DA('r',"Receptionist",15000);
allowArray[4] = new DA('m',"Manager",40000);

for(int i =0; i<empArray.length;i++){
   if(empArray[i].empNo == input){
     empIndex = i;
    }
}
for(int y =0; y<allowArray.length;y++){
   if(empArray[empIndex].designationCode == allowArray[y].designationCode){
     daIndex = y;
     dc = allowArray[y].designationCode;
    }
}
switch(dc){
     case 'e':
         designation="Engineer";
         break;
     case 'c':
         designation="Consultant";
         break;
     case 'k':
         designation="Clerk";
         break;
     case 'r':
         designation="Receptionist";
         break;
     case 'm':
         designation="Manager";
         break;
     
}
salary = empArray[empIndex].basic+empArray[empIndex].hra+allowArray[daIndex].da-empArray[empIndex].it;
System.out.println("EmpNo         EmpName           Department       Designation        Salary");
System.out.println(empArray[empIndex].empNo+"          "+empArray[empIndex].empName+"              "+empArray[empIndex].department+"            "+designation+"              "+salary);

}

}