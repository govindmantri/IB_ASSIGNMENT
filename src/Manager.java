import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Manager {

  public static void main(String[] args) {
    
    Street s1=new Street(1,"Margao");
    Street s2=new Street(2,"Panaji");
    
    Building b1= new Building(1,"Shiv towers",s1);
    Building b2= new Building(2,"leandra Complex",s1);
    Building b3= new Building(3,"Sandra residency",s2);
    
    Flat flat1 =new Flat(1,10,"A1","1bhk",b1);
    Flat flat2 =new Flat(2,20,"A2","2bhk",b1);
    Flat flat3 =new Flat(3,10,"A3","1bhk",b1);
    Flat flat4 =new Flat(4,30,"B1","1bhk",b2);
    Flat flat5 =new Flat(5,10,"B2","1bhk",b2);
    Flat flat6 =new Flat(6,30,"A1","3bhk",b1);
    
    Person person1= new Person("carol","owner",1, flat1);
    Person person2= new Person("candy","owner",2, flat2);
    Person person3= new Person("tina","tenant",3, flat3);
    Person person4= new Person("mina","tenant",4, flat1);
    Person person5= new Person("dina","tenant",5, flat2);
    Person person6= new Person("carol","owner",6, flat5);
    Person person7= new Person("carol","owner",6, flat6);
    
    ArrayList<Person> persons= new ArrayList<Person>();
    persons.add(person1);
    persons.add(person2);
    persons.add(person3);
    persons.add(person4); 
    persons.add(person5);
    persons.add(person6);
    
    ArrayList<Flat> flat=new ArrayList<Flat>();
    flat.add(flat1);
    flat.add(flat2);
    flat.add(flat3);
    flat.add(flat4);
    flat.add(flat5);
    flat.add(flat6);
    
    
  
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    int choice=0;
    int choice2=0;
    Model model =new Model();
    while(choice!=6)
    {
        System.out.println("Enter 1 to find person's address.");
        System.out.println("Enter 2 to find average  area of flats in a building ");
        System.out.println("Enter 3 to find total area occupied by tenant");
        System.out.println("Enter 4 to find num of flats owned by a person.");
        System.out.println("Enter 5 to find type of flats.");
        System.out.println("Enter 6 to exit..");
        System.out.println("Enter choice...");
        System.out.println(" ");
        
        while(!sc1.hasNextInt())
        {
            System.out.println("please enter valid input..");
            sc1.next();
            
        }
        choice=sc1.nextInt();
        
        switch(choice)
        {
          case 1:
          System.out.println("Enter persons name: ");
          String name= sc2.nextLine();
          String address= model.searchAddress(persons, name);
          System.out.println("Address:  "+address);
          break;
          
          case 2:
            System.out.println("Enter building name: ");  
            String Bname= sc2.nextLine();
            break;
          case 3:
           float area= model.findArea(persons);
           System.out.println("total area occupied by tenants= "+area);
           break;
            
          case 4:
            System.out.println("Enter person name: ");
            name=sc2.nextLine();
            int noOfFlats=model.findNoOfFlatsOwned(persons, name);
            System.out.println("No of flats owned= "+noOfFlats);
            break;
          case 5:
            System.out.println("Enter flat name: ");
            String fName=sc2.nextLine();
            String type=model.findTypeOfFlat(flat, fName);
            System.out.println("Flat type=  "+type);
            break;
          case 6:
            break;
        }
        
    }
    
    
  }
}
