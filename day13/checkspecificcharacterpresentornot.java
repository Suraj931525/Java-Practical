public class checkspecificcharacterpresentornot{
public static void main(String[]args){
String str="patil";
int flag=0;
for(int i=0;i<=str.length();i++){
if(str.charAt(i)=='t')
{

flag=1;
break;
}
}
if(flag==1){
System.out.print("Character is present in the string");
}
else{
System.out.print("Character is not present in the string");

}



}
}