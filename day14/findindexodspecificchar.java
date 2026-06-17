import java.util.*;
public class findindexodspecificchar{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter the string");

String surname=sc.next();

System.out.println("enter the charcter");
char character = sc.next().charAt(0);
int count=0;

char character1[]=surname.toCharArray();

for(int i=0;i<character1.length;i++){
if(character1[i]==character){
System.out.println("index of " +character +"is" +i);
count++;
}

}
if(count==0){
System.out.println("char not present in String");
}
else{
System.out.println("char is present in the array");
}

}
}



