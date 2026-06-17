import java.util.*;
public class findcharwithhelpofindex{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter the string");

String surname=sc.next();

System.out.println("enter the index");
int index=sc.nextInt();
char character[]=surname.toCharArray();

for(int i=0;i<character.length;i++){
if(i==index){
System.out.println(character[i]);
}

}

}
}



