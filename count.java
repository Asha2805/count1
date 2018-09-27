import java.util.*;
public class count
{
public static void main(String[] args)
{
int count=0;
int num;
Scanner w=new Scanner(System.in);
num=w.nextInt();
while(num>0)
{
rem=num%10;
count++;
num=num/10;
}
System.out.println(count);
}
}
