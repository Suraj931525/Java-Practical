public class specificelementpresentinarrayornot{
public static void main(String[]args){

int arr[]={1,2,3,4,56,89,78,78};
int element=56;
int flag=0;

for(int i=0; i<arr.length;i++){

if(arr[i]==element){
flag=1;
break;

}
}

if(flag==1){
System.out.println("element is present");

}
else{
System.out.println("element is not present");

}



}
}