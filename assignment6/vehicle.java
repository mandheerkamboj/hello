abstract class Vehicle
{
 abstract void start() ;
 void stop()
 {
 }
}
class Two extends Vehicle
{
 void start()
 {
  System.out.println("start twowheeler "); 
 }
 void stop()
 {
  System.out.println("stop twowheeler"); 
 }
}

class Four extends Vehicle
{
 void start()
 {
  System.out.println("start fourwheeler"); 
 }
 void stop()
 {
  System.out.println("stop fourwheeler"); 
 }
}

class Display
{
 public static void main(String args[])
 {
 Vehicle t=new Two();
 t.start();
 t.stop();
 Vehicle f=new Four();
 f.start();
 f.stop();
}
}