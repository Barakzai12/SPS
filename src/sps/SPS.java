
package sps;
import java.util.Scanner;

class Driver
{
   Scanner read=new Scanner(System.in);
   int Id;
   String name;
   String Address;
   String Licence;
      void getDriver_info()
      {
          System.out.println("============> Driver Details <============");
          System.out.print("Enter Driver id:");
          Id=read.nextInt();
          System.out.print("Name:");
          name=read.next();
          System.out.print("Address:");
          Address=read.next();
          System.out.print("Licence:");
          Licence=read.next();
      }
}
class Vehical extends Driver
{
    String Plate_no;
    String type;
      String color;
      void Vehical_info()
      {
          System.out.println("============> Vehical Details <============");
          System.out.print("Enter Vehical Plate_no:");
          Plate_no=read.next();
          System.out.print("Type:");
          type=read.next();
          System.out.print("Color:");
          color=read.next();   
      }
      
}
class Time extends Vehical
{
     String Entered_time;
     String Exit_time;
     
}
class Report extends Time
{
    void display_report()
    {
        System.out.println("============> Report <============");
        System.out.println("Driver id\tName\tLicence");
        System.out.println(Id+"\t\t"+name+"\t"+Licence);
        System.out.println("Vehical_Plate_no:\tType\tColor");
        System.out.println(Plate_no+"\t\t\t"+type+"\t"+color);
    }
}
public class SPS {

    public static void main(String[] args) {
         Report rp=new Report();
         Scanner read=new Scanner(System.in);
         int choice,did;
         
         for(;;)
         {
         System.out.println("===========> Smart Parking System <===========");   
         System.out.println("1:Register\n2:Report\n3:Exit\n4:Close");
         System.out.println("=======================================");
         choice=read.nextInt();
         switch(choice)
         {
             case 1:
                 rp.Vehical_info();
                 rp.getDriver_info();
                 break;
             case 2:
                 rp.display_report();
                 break;
             case 3:
                        System.out.print("Enter dirver id:");
                        did=read.nextInt();
                        if(did==rp.Id){
                            rp.display_report();
                        }
                        else
                        {
                            System.out.println("Invalid Id"); 
                        }
                        break;
             case 4:
                 System.exit(0);    
             default:
                 System.out.println("Invalid Option");
         }
         }
    }
}
