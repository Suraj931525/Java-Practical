public class smallestnumber{
public static void main(String []args){


int arr[]={1,2,3,4,5,6,7};

int small=arr[0];
for(int i=0;i<arr.length;i++){

if(small>arr[i]){

small=arr[i];
}

}
Syatem.out.println("this is smallest element in array"+small);
}
}