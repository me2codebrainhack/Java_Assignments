class PatternPrint{
public static void main(String args[]){
for(int i =1;i<=5;i++){
int k=i;
for(int j =5;j>=i;j--){
System.out.print(k);
k++;
}
System.out.println();
}
}
}