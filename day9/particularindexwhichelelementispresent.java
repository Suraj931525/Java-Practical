import java.util.*;
public class particularindexwhichelelementispresent{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the index that element you want");
int index=sc.nextInt();
int flag=0;

int a=0;
int arr[]={1,2,3,45,6};

for(int i=0;i<arr.length;i++){
if(index==i){
 a=arr[i];
flag=1;
break;
}
}
if(flag==1){
System.out.println(index  +"index"+ a +" element present");
}
else{
System.out.print("element is not present");
}


}
}