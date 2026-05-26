public class perfectnumber{
public static void main(String args[]){

int num=6;
int sum=0;
for(int i=1;i<num;i++)
{                                      //i=1 1<6true i=2 2<6true i=3 3<6true 4<6true
                                            //  5<6true 6<6false
                                                      //6%0
if(num%i==0)//1 2 3 4false 5false
{
sum=sum+i;   
           //sum=0+1 sum=1+2 sum=3+3 sum=6
}

System.out.println(sum);
}
}
}