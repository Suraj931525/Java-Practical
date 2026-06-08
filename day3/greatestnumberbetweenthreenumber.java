import java.util.*;
public class greatestnumberbetweenthreenumber{
 public static void main(String[]args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter First Number");
int number1=sc.nextInt();

System.out.println("Enter second Number");
int number2=sc.nextInt();


System.out.println("Enter third Number");
int number3=sc.nextInt();


if(number1>number2  && number1>number3)
{

System.out.println(number1+" is greatest number" );
}

else if(number2>number1  && number2>number3)
{
System.out.println(number2+" is greatest number" );
}

else{

System.out.println(number3+"is greatest number");
}

}
}