class StringMethods{
public static void main(String args[]){
String s = "Hello";
String x = s.concat("World");
System.out.println(s);
System.out.println(x);
System.out.println(s.length());
System.out.println(x.charAt(3));
System.out.println(s.equalsIgnoreCase(x));
System.out.println(s.toLowerCase());
System.out.println(x.toUpperCase());
System.out.println(x.isEmpty());
String z = "This is a java";
System.out.println(z.substring(4));
System.out.println(z.substring(4,9));
System.out.println(z.substring(0,4));
System.out.println(z.contains("lo"));
System.out.println(z.replace("is","was"));
System.out.println(z.indexOf("T"));
}
}