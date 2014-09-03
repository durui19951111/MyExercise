interface Car
{
    
    public void talk();
}
class Bus implements Car
{
    String bus="我是公共汽车";
    public void talk()
    {
      System.out.println(bus);
     }
}
class SportsCar implements Car
{
    String sportscar="我是跑车";
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

  

