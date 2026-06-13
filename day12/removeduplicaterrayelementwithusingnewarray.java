public class removeduplicaterrayelementwithusingnewarray{
public static void main(String[]args){

int arr[]={1,2,2,3,3,3,4,5,5,6,6,7,8,8,9};
int arr2[]=new int[arr.length]
count=0;

for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++)
{
I	if(arr[i]==arr[j]){
	count++;
	}	
}
}
if(count==0){
for(int i=0;i<arr.length;i++){
System.out.print(arr[i])
}

else{

arr2[i]=arr[i];

}

for(int i=0;i<arr2.length;i++){

System.out.println(arr[i]);
}


}

}