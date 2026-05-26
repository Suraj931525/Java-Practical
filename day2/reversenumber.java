import java.util.*;
public class reversenumber{
public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
int rem=0;
int temp=num;
int rev=0;

while(temp>0){
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
System.out.println(rev);
}
}
