import java.util.Scanner;
public class Main<choice> {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Hotel AquaLand");

        System.out.println("--------------------------");

        System.out.println("Do you want to reserve a Room ? Yes = 1 , No = 2 ");

        Scanner s = new Scanner(System.in);

        int choice = s.nextInt();

        if (choice == 1)

            System.out.println("Please Choose Your Package(P1 = 1, P2 = 2, P3 = 3)");

            else if (choice ==2)
            System.out.println("Cancel Reservation");

            else {
                System.out.println("Invalid Input!!!!");
        }

            {

            int choose = s.nextInt();
                {
                    if (choose != 1) {
                    System.out.println();
                    }
                    //PACKAGE 1

                    Account a1 = new Account();
                    SetName stnm = new SetName();
                    RoomType rt = new RoomType();
                    PCC pcc = new PCC();

                    System.out.println("DETAILS :");
                    System.out.println("1 Bedroom with Balcony " +
                            "Good for 4-6 Guests ");

                    System.out.println("TO RESERVE : 2.000 TL via bank deposit; refundable upon check-out " +
                            "non-refundable on cancellation; strictly no re-scheduling.First reserve,gets the slots");

                    System.out.println("Fixed Schedule ");
                    System.out.println("Check in : 2:00 pm ");
                    System.out.println("Check out : 12:00 am " + "the next day ");


                    System.out.println("Please fill up the needed information");

                    System.out.println("Name");
                    a1.setName(s.next());
                    System.out.println("Room No. : ");
                    stnm.setRoom(s.next());
                    System.out.println("Room Type : ");
                    rt.setRoomType(s.next());
                    System.out.println("Bed Type");
                    rt.setBedType(s.next());
                    System.out.println("Phone Number");
                    pcc.setPhoneNumber(s.next());
                    System.out.println("Check in");
                    pcc.setCheckin(s.next());
                    System.out.println("Check out");
                    pcc.setCheckout(s.next());

                    a1.display();
                    stnm.display();
                    rt.display();
                    pcc.display();



                    System.out.println("------------------------------");

                    System.out.println("Package 1 is worth 12.000 TL");

                    System.out.println("Thank you For Choosing Our Hotel");


                }
                {
                    if (choose != 1) {

                    }
                else if (choose != 2) {
                    {
                    }
                }
            }

            // PACKAGE 2

                Account a1 = new Account();
                SetName stnm = new SetName();
                RoomType rt = new RoomType();
                PCC pcc = new PCC();

            System.out.println("DETAILS :");
            System.out.println("1 Bedroom " +
                    "Good for 2-4 Guests ");

            System.out.println("TO RESERVE : 2.000 TL via bank deposit; refundable upon check-out " +
                    "non-refundable on cancellation; strictly no re-scheduling.First reserve,gets the slots");

            System.out.println("Fixed Schedule ");
            System.out.println("Check in : 2:00 pm ");
            System.out.println("Check out : 12:00 am " + "the next day ");


            System.out.println("Please fill up the needed information");

            System.out.println("Name");
            a1.setName(s.next());
            System.out.println("Room No. : ");
            stnm.setRoom(s.next());
            System.out.println("Room Type : ");
            rt.setRoomType(s.next());
            System.out.println("Bed Type");
            rt.setBedType(s.next());
            System.out.println("Phone Number");
            pcc.setPhoneNumber(s.next());
            System.out.println("Check in");
            pcc.setCheckin(s.next());
            System.out.println("Check out");
            pcc.setCheckout(s.next());

            System.out.println("------------------------------");

            a1.display();
            stnm.display();
            rt.display();
            pcc.display();
            System.out.println("Package 2 is worth 10.000 TL");

            System.out.println("Thank you For Choosing Our Hotel");



            // PACKAGE 3

            a1 = new Account();
            stnm = new SetName();
            rt = new RoomType();
            pcc = new PCC();

            System.out.println("DETAILS :");
            System.out.println("1 Bedroom with Balcony(City View) " +
                    "Good for 2 Guests ");

            System.out.println("TO RESERVE : 2.000 TL via bank deposit; refundable upon check-out " +
                    "non-refundable on cancellation; strictly no re-scheduling.First reserve,gets the slots");

            System.out.println("Fixed Schedule ");
            System.out.println("Check in : 2:00 pm ");
            System.out.println("Check out : 12:00 am " + "the next day ");


            System.out.println("Please fill up the needed information");

            System.out.println("Name");
            a1.setName(s.next());
            System.out.println("Room No. : ");
            stnm.setRoom(s.next());
            System.out.println("Room Type : ");
            rt.setRoomType(s.next());
            System.out.println("Bed Type");
            rt.setBedType(s.next());
            System.out.println("Phone Number");
            pcc.setPhoneNumber(s.next());
            System.out.println("Check in");
            pcc.setCheckin(s.next());
            System.out.println("Check out");
            pcc.setCheckout(s.next());

            System.out.println("------------------------------");

            a1.display();
            stnm.display();
            rt.display();
            pcc.display();
            System.out.println("Package 3 is worth 15.000 TL");

            System.out.println("Thank you For Choosing Our Hotel");



        }
        {
        }
    }}