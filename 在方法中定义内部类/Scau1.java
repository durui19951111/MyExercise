class School
{
   String name="四川农业大学";
   void inform()
     {
        class Location
       {
          void display()
          {
            String dress="雅安市雨城区新康路46号";
            System.out.println("位于"+dress);
           }

         }
      System.out.println(name);
      Location city = new Location();
      city.display();
      }
}
public class Scau1
{
     public static void main(String[] args)
      {
         School myschool = new School();
         myschool.inform();
       }
}
