class Main{
public static void main(String[]args){
int num=17564,res=0;
while(num>0)
{
res=num%10;
if(res%2==0)
{
System.out.println("even"+res);
}
num=num/10;

}

}
}
