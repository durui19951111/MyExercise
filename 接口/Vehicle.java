interface Car
{
    
    public void talk();
}
class Bus implements Car
{
    String bus="���ǹ�������";
    public void talk()
    {
      System.out.println(bus);
     }
}
class SportsCar implements Car
{
    String sportscar="�����ܳ�";
    public void talk(sportscar);
}
class Name
{
   public void run(Car car) 
      {
         car.talk();
       }
}
class Vehicle
{
  public static void main(String[] args)
   {
      new Name().run(new Bus());
      new Name().run(new SportsCar());
   }
}

  

