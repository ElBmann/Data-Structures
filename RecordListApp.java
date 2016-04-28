package HW3;

/**
 * Created by Brian Recuero on 4/13/2016.
 * Data Structures Doubly Link
 * This class is for the user to add Links
 * and manipulate given the options we gave.
 */    import java.util.Scanner;

   public class RecordListApp {

       public static void main(String[] args)
       {
           RecordList List = new RecordList();//..........................................................................Link
           Scanner input = new Scanner(System.in);//......................................................................Allows user to input
           int menu = 0;
           Student data;
           String id = "";
           String idKey = "";
           String name = "";


           while (menu != 9)
           {

               System.out.println("Please Select a number in the menu: \n" + " 1: Insert First  \n " +
                       "2: Insert Last \n 3: Delete First  \n 4: Delete Last  " +
                       "\n 5: Insert After  \n 6: Insert Before \n 7: Display \n 8: Sort  " +
                       "\n 9: Exit ");
               menu = input.nextInt();//..................................................................................User Options

               switch (menu) {//........................................................................................................Switch Case Menu
                   case 1:
                       System.out.println("Please enter id: ");//......................................Prompt for the item price
                       id = input.next();
                       System.out.println("Please enter name: ");
                       name = input.next();
                       input.nextLine();
                       data = new Student(id, name);
                       List.insertFirst(data);
                       break;
                   case 2:
                       System.out.println("Please enter name: ");
                       name = input.next();
                       System.out.println("Please enter id:");//......................................Prompt for the item price
                       id = input.next();
                       data = new Student(id, name);
                       List.insertLast(data);
                       break;
                   case 3:
                       if(List.isEmpty())
                       {
                           System.out.println("Nothing Here");
                       }
                       else
                       {
                           System.out.println("You have chosen Delete First:");//find away maybe to display the menu once agian
                           System.out.println("\n You Deleted: " + List.deleteFirst());
                       }

                       break;
                   case 4:
                       if(List.isEmpty())//Take a look at delete last try to fix it
                       {
                           System.out.println("Nothing Here");
                       }
                       else{
                           List.deleteLast();
                       }

                       break;
                   case 5:
                       System.out.println("Please Enter ID You Want To Insert After? ");
                       idKey = input.next();
                       System.out.println("Please Enter ID: ");
                       id = input.next();
                       System.out.println("Please Enter Name: ");
                       name = input.next();
                       data=new Student (id, name);
                       List.insertAfter(idKey, data);//***CHANGE INDEX ID***
                       break;
                   case 6:
                       System.out.println("Please Enter ID You Want To Insert Before ");
                       idKey=input.next();
                       System.out.println("Please Enter ID: ");
                       id = input.next();
                       System.out.println("Please Enter Name: ");
                       name= input.next();
                       data = new Student(id, name);
                       List.insertBefore(idKey, data);

                       break;
                   case 7:
                       System.out.println(List.toString());
                       break;
                   case 8:
                       if(List.isEmpty())//add if there is one element cant sort
                       {
                           System.out.println("Nothing Here");
                       }
                       else
                       {

                           List.insertionSort();
                           List.insertionSort();
                           List.insertionSort();
                       }
                       break;
                   case 9:
                       break;
                   default:
                       System.out.println("You Failed To Pick The Right Option");//.......................................If User Chooses a number out of bounds
               }
           }

       }
   }
//End App Class

