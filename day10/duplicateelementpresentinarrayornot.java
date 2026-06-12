public class duplicateelementpresentinarrayornot{
public static void main(String[]args){


int ar[]={56,21,47,83,90};
int count=0;
for(int i=0;i<ar.length;i++)
{
for(int j=i+1;j<ar.length; j++)
{
if(ar[i]==ar[j])
{
count++;
}
}
}
if(count==0)
{
System.out.println("Duplicate numbers are not present in the array");
}
else{
System.out.println("Duplicate number are present in the array");
}



}

}