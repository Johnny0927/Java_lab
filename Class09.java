class CCalculator
{
   int a;
   int b;
   int c;
   void set_value(int x,int y,int z)
   {
    x=25;//obj.set_value()裡面是000預設值，是在main裡輸入的
    y=3;
    z=7;
   }
   void show()
   {
   System.out.print(a+" "+b+" "+c);
   }
    int add()
   {
    return a+b+c;
   }
    int sub()
    {
     return a-b-c;
    }
    int mul()
    {
     return a*b*c;
    }
    int avg()
    {
     return (a+b+c)/3;
    }
}
 public class eel
 {
 public static void main(String args[])
 {
      CCalculator obj=new CCalculator();  
  obj.a=25; obj.b=3; obj.c=7;
      obj.show();
  obj.add();
 }
 }
