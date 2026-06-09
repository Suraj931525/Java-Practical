public class pattern1{
public static void main(String[]args){

for(int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
System.out.print(" ");

}
for(int y=5;y>=i;y--){
if(y==1||y==3||y==5){
System.out.print("0");
}
else{
System.out.print("1");
}



}
System.out.println();

}
}
}