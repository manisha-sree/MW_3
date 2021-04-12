import java.util.scanner;
class AgeExcepation extends Exception{
public AgeException(string str) {
System.out.printn(str);
}
}
public class AgeExcDemo{
public static  void main(string[]args){
Scanner s=new scanner (system.in);
System.out.print("Enter ur age ::");
int age=s.nextInt();
try{
if(age<20)
throw new AgeException("Invalid age");
else
System.out.println("valid  age");
}
catch(AgeException a){
System.out.println(a);
}
}
}