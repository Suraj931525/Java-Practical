import java.util.*;
public class dublicateelementpresentinstringornot{
public static void main(String []args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the String ");
String name=sc.next();
int count=0;

for(int i=0;i<name.length();i++){
   for(int j=i+1;j<name.length();j++){
     if(name.charAt(i)==name.charAt(j)){
      count++;
       System.out.println("duplicate element present is" + name.charAt(i));
}
}
}
if(count==0){
System.out.println("Duplicate element is not present");
}
else{
System.out.println(count+"duplicate element present in sting");
}
String result="";

for(int i=0;i<name.length();i++){
char ch=name.charAt(i);
 if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}