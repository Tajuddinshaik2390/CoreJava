public class Max_array
{
public static int max_no(int a[])
{
int max=a[0];
for(int i=1; i<a.length; i++)
{
if(a[i]>max)
{
max=a[i];
}
}
return max;
}
public static void main(String ar[])
{
int a0[]= {23, 14, 15, 29, 10};
int a1[]= {-23, -14, -15, -29, -10};
int maxm0=max_no(a0);
System.out.println("The max is : " + maxm0);
int maxm1=max_no(a1);
System.out.println("The max is : " + maxm1);
}
}

