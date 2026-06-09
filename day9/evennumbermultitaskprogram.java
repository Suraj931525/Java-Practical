public class evennumbermultitaskprogram{
public static void main(String[]args){
int arr[]={66,34,82,91,70};
int flag=0;
int count=0;

for(int i=0;i<arr.length;i++){
if(arr[i]%2==0)
{
flag=1;
}
}

if(flag==1){
System.out.println("Even number is present in the array");
}
else{
System.out.println("Even number is present in the array");

}

for(int i=0;i<arr.length;i++){

if(arr[i]%2 == 0){

System.out.println(arr[i] +"this is even number");
count++;

}
}

System.out.println("The count of even number in array is "+count);
}
}