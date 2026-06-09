public class largestnumber{
public static void main(String[]args){

int arr1[]={1,2,3,4,5,6,7,8,9};

int max=0;
   for(int i=0;i<arr1.length;i++){

if(max<arr1[i]){

 max=arr1[i];

}



}

System.out.println("The largest element is "+ max);
}
}