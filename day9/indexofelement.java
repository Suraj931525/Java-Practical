import java.util.*;
public class indexofelement{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the element of array");
int num=sc.nextInt();
int flag=0;
int index=0;

int arr[]={1,2,3,45,6};

for(int i=0;i<arr.length;i++){
if(num==arr[i]){
flag=1;
 index =i;
}
}
if(flag==1){
System.out.println("index num is present in "+ index);
}
else{
System.out.print("element is not present");
}


}
}