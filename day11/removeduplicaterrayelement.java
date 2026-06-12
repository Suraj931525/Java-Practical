public class removeduplicaterrayelement{
public static void main(String[]args){

int arr[]={1,2,2,3,4,4,5,6,7,7};
int count=0;
int arr2[]=new int[arr.length];


for(int i=0;i<arr.length;i++){
   for(int j=i+1;j<arr.length;j++){
   if(arr[i]==arr[j]){

   System.out.print("this is duplicate element"+arr[i]);
   count++;

}
}


if(count==1){
arr2[i]=arr[i];
}
}
for(int i=0;i<arr2.length;i++){

System.out.println(arr2[i]);
}
}
}