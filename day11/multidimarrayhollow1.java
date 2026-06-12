public class multidimarrayhollow1{
public static void main(String[]args){

int arr[][]={
	{2,3,3},{8,4,5},{7,8,9}
};
for(int i=0;i<arr.length;i++){

    for(int j=0;j<arr.length;j++){
if(i==0 ||j==0||i==2||j==2){
    System.out.print(arr[i][j]);
}else{

System.out.print(" ");
}
      
}
System.out.println();

}	

}

}