public class factorialnumberwithoutuser{
public static void main(String []args){
int num=10;
int fact=1;
int temp=num;
while(num>0){
fact=fact*num;
num--;
}
System.out.println("The facrorial of number is "+ temp +  "=" +fact);
}
}
