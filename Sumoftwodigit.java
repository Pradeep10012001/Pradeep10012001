class Sumoftwodigit
{
public static void main(String args[])
{
Sumoftwodigit Obj=new Sumoftwodigit();
Obj.sum();
}

public void sum()
{
  int n=4444;
if(n>=0&&n<=9) 
{
System.out.println("the number single digit ");
}
else if (n>=10&&n<=99)
{
int a=n%10;//4
int b=n/10;//4
 int c=a+b;
System.out.println("the answer is "+c);
}
else if(n>=100&&n<=999)
{
int d=n%10;//4
int e=n/10;//44
int f=e%10;//4
int h=e/10;//4
int g=d+f+h;
System.out.println("the answer is "+g);
}
else if (n>=1000&&n<=9999)
{

int w=n%10;//4
int x=n/10;//444
int y=x%10;//4
int z=x/10;//44
 int u=z%10;//4
int v=z/10;//4
int t=w+y+u+v;
System.out.println("the answer is "+t);
}
else 
{
System.out.println("the invalid number");
}
}










}
