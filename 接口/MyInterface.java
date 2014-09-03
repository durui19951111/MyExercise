interface A
{
    String a="我是A";
    public void talkA();
}
interface B
{
    String b="我是A";
    public void talkB();
}
interface C extends A,B
{
    String c="我是C";
    public void talkC();
}
class D implements C
{
   public void talkA()
   {
    System.out.println(a);
   }
   public void talkB()
   {
    System.out.println(b);
   }
   public void talkC()
  {
    System.out.println(c);
  }
}
class MyInterface
{
public static void main(String[] args)
   {
      D shuchu = new D();
      shuchu.talkA();
      shuchu.talkB();
      shuchu.talkC();
    }
}

