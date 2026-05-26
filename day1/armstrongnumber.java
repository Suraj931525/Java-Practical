import java.util.*;
public class armstrongnumber{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);

System.out.println("Enter the number");
int num=sc.nextInt();

int rem=0;
int sum=0;

while(num>0){
rem=num%10;  
sum=sum+rem*rem;
num=num/10;

}

if(num==sum){
System.out.println("Arm strong number");
}
else{
System.out.println("not Arm strong number");
}


}
}
