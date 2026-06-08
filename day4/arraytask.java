import java.util.*;
public class arraytask{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=sc.nextInt();

String flower[]=new String[size];

System.out.println("Enter the flower name");

for(int i=0;i<size;i++){
 flower[i]=sc.next();

}

for(int j=0;j<size;j++){
System.out.println(flower[j]);
}

}
}