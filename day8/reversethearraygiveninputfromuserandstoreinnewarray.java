import java.util.*;
public class reversethearraygiveninputfromuserandstoreinnewarray{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of array");
int size=sc.nextInt();

int arr1[]=new int[size];
int arr2[]=new int[size];

int num=0;

for(int i=0;i<size;i++){

System.out.print("Enter element at " + num + " index: ");
num++;
 arr1[i]=sc.nextInt();
}

int k=0;
for(int j=size-1;j>=0;j--){

arr2[k]=arr1[j];
k++;



}

System.out.println("Original array ");

for(int i=0;i<arr1.length;i++){

  System.out.print(arr1[i]+" ");

}
System.out.println();



System.out.println("Reverse  array ");

for(int i=0;i<arr2.length;i++){

  System.out.print(arr2[i]+" ");

}
System.out.println();

}
}