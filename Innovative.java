import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter; 
import java.io.BufferedWriter;   
import java.io.IOException;
import java.io.Writer;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle; 
import java.io.*;
import java.lang.Thread;
  
class Registration 
{
    String MobileNumber;
    String Name;
    long OTP;
    int rand;
    String pass;
    int x;
    int Vaccine;

    void Details() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tWELCOME TO COWIN Registration. VACCINATE YOURSELF AND LETS FIGHT AGAINST COVID-19 TOGETHER");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("DEAR USER, PLEASE ENTER YOUR FIRST NAME(IN CAPITAL)                              : ");
        Name = sc.nextLine();
        System.out.print("PLEASE ENTER YOUR MOBILE NUMBER                                                  : ");
        MobileNumber = sc.nextLine();
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("OTP LOADING. PLEASE WAIT!");
    }

    void OtpGeneration() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        Random x = new Random();
        rand = x.nextInt(1000000) + 1;
        try 
        {
        Thread.sleep(5000);
        System.out.println("YOUR OTP IS " + rand);
        }
        catch (Exception e) {
        System.out.println(e);
        }
        System.out.print("ENTER THE GIVEN OTP                                                              : ");
        OTP = sc.nextLong();
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
    }

    void OtpVerification() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE WAIT WHILE WE VERIFY YOUR OTP");
        if (rand == OTP) 
        {
            System.out.println("YOU HAVE ENTERED THE CORRECT OTP. LET'S PROCEED FURTHER");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        } 
        else 
        {
            System.out.println("YOUR OTP IS WRONG. WE WILL SEND ANOTHER OTP. ENTER IT CAREFULLY");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
            try {
                System.out.print("LOADING....");
                System.out.println();
                System.out.println();
                Thread.sleep(5000);
                System.out.print("YOUR NEW OTP IS ");
                Random x = new Random();
                rand = x.nextInt(1000000) + 1;
                System.out.println(rand);
        }
        catch (Exception e) {
            System.out.println(e);
        }
            System.out.print("ENTER THE GIVEN OTP                                                              : ");
            OTP = sc.nextLong();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    void DisplayMobileNumber()
     {
        try 
        {  
            LocalDateTime current = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
            String formatted = current.format(formatter);
            FileWriter F = new FileWriter("F:Certificate.txt");
            F.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            F.write("\n");  
            F.write("\t\t\t\t\tACCOUNT DETAILS FOR DOSE 1");
            F.write("\n");  
            F.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            F.write("\n"); 
            F.write("Date And Time           : " + formatted);
            F.write("\n");
            F.write("MOBILE NUMBER     : ");
            F.write(MobileNumber);
            F.write("\n");   
            F.close();    
        }
        catch (IOException e) 
        {  
            System.out.println("Unexpected error occurred");  
            e.printStackTrace();  
        }  
    } 
}

class Slot_Booking extends Registration  
{
    int Number;
    String AadharCardNumber;
    String strName;
    String strGender;
    int YearOfBirth;
    String VaccineType;
    String Center;
    String BookingTime;
    String BookingDate;
    int rand1, rand2;

    void Password_Set()
    {
        Scanner sc = new Scanner(System.in);
        x = 0;
        System.out.println();
        System.out.print("PLEASE SET YOUR PASSWORD WITH LENGTH FROM 8-32 CHARACTERS                        : " );
        pass = sc.nextLine();
        System.out.println();
        System.out.println();

        int length = pass.length();
        int flag = 0;
        if (!(length >= 8 && length <= 32))
        {
            do 
            {
                System.out.println("\n\tERROR! LENGTH OF YOUR PASSWORD SHOULD BE LENGTH 8 - 32 CHARACTERS ENTER IT ONCE AGAIN: ");
                System.out.print("PLEASE SET YOUR PASSWORD WITH LENGTH FROM 8-32 CHARACTERS                        : " );

                pass = sc.nextLine();
                length = pass.length();
                System.out.println();
                if (length >= 8 && length <= 32) 
                {
                    flag = 1;
                    break;
                }
                x++;
            } 
            while (x < 3);
           {
            if (!(length >= 8 && length <= 32))
            {
                System.out.println("\n\tSORRY - YOU HAVE EXHAUSTED THE MAXIMUM TRIALS ..");
            }
        }
           }
        else 
        {
            flag = 1;
        }
    }

    void Booking() 
    {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("/********************************/");
        System.out.print("ENTER THE 12 DIGIT AADHAR CARD NUMBER                                            : ");
        AadharCardNumber = sc.nextLine();
        int Alength = AadharCardNumber.length();
        int flag = 0, x = 0;
        System.out.print("ENTER YOUR FULL NAME                                                             : ");
        strName = sc.nextLine();
        System.out.print("ENTER YOUR GENDER                                                                : ");
        strGender = sc.nextLine();
        System.out.print("ENTER YOUR YEAR OF BIRTH                                                         : ");
        YearOfBirth = sc.nextInt();
        if(YearOfBirth>2003)
        {
            System.out.println();
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\tSORRY! YOUR ARE 18 OR LESS YEARS OLD SO YOU ARE NOT ELIGIBLE TO TAKE VACCINE");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
            System.exit(0);
        }
        System.out.println("THE DETAILS OF  " + strName + " SAVED SUCCESSFULLY");
        System.out.println("/********************************/");
        System.out.println();
        System.out.println();
    }

    void Slot() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("CHOOSE THE VACCINE TYPE FROM BELOW OPTIONS\n");
        System.out.println("\t->1.COVISHIELD");
        System.out.println("\t->2.COVAXIN");
        System.out.println("\t->3.PFIZER");
        System.out.println("\t->4.MODERNA");
        System.out.println("\t->5.SPUTNIK V");
        System.out.print("VACCINE TYPE                                                                     : ");
        VaccineType = sc.nextLine();
    }

    void Appoinment() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("NOW WE WILL SCHEDULE YOUR 1st DOSE APPOINTMENT");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("CHOOSE YOUR NEAREST VACCINATION CENTER WHICH IS CONVENIENT TO YOU                : ");
        Center = sc.nextLine();
        Random x1 = new Random();
        rand1 = x1.nextInt(30) + 1;
        Random x2 = new Random();
        rand2 = x2.nextInt(6) + 1;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
    }

    void Appoinment2() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("NOW WE WILL SCHEDULE YOUR 2nd DOSE APPOINTMENT");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("CHOOSE YOUR NEAREST VACCINATION CENTER WHICH IS CONVENIENT TO YOU              : ");
        Center = sc.nextLine();
        Random x1 = new Random();
        rand1 = x1.nextInt(27) + 1;
        Random x2 = new Random();
        rand2 = x2.nextInt(6) + 1;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
    }

    void DisplayOtherDetails()
    {
        try 
        {  
            BufferedWriter writer = new BufferedWriter(
            new FileWriter("F:Certificate.txt", true));  
            writer.write("Name                             : ");  
            writer.write(strName);
            writer.write("\n");
            writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            writer.write("\n");  
            writer.write("YearOfBirth" + "\t\t" + "AadharCardNumber" + "\t\t" + "gender");
            writer.write("\n"); 
            writer.write("   "+YearOfBirth + "\t\t\t" +"   "+ AadharCardNumber + "\t\t\t" +"  "+ strGender);
            writer.write("\n");
            writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            writer.write("\n");  
            writer.write("DOSE:1 |" +"VaccineType:"+VaccineType);
            writer.write("\n");  
            writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            writer.write("\n");  
            writer.write("Center" + "\t\t" +"     "+ "Date"  + "\t\t" + "Time");
            writer.write("\n"); 
            writer.write(Center + "\t\t" + rand1 + "-12-2021" + "\t" + rand2 + " PM");
            writer.write("\n");  
            writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            writer.write("\n"); 
            writer.write("DOSE:2");
            writer.write("\n"); 
            writer.write("APPOINMENT IS NOT AVAIABLE");
            writer.write("\n"); 
            writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            writer.close();
        } 
        catch (IOException e) 
        {  
            System.out.println("Unexpected error occurred");  
            e.printStackTrace();  
        }  
    } 

        void Dose2()
        {
            Scanner sc=new Scanner(System.in);
            String password;
            System.out.print("ENTER YOUR PASSWORD TO BOOK YOUR SLOT FOR DOSE 2                                 : ");
            password = sc.nextLine();
            if(pass.equals(password))
            {
                try {  
                    BufferedWriter writer = new BufferedWriter(
                    new FileWriter("F:Certificate.txt", true));  
                    writer.write("\n");
                    writer.write("\n");
                    writer.write("\n");
                    writer.write("*****************************************************************************************************************************************************************************************");
                    writer.write("\n");
                    writer.write("\n");
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");
                    writer.write("\t\t\t\t\tACCOUNT DETAILS FOR DOSE 2");
                    writer.write("\n");
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");  
                    writer.write("YearOfBirth" + "\t\t" + "AadharCardNumber" + "\t\t" + "gender");
                    writer.write("\n"); 
                    writer.write("   "+YearOfBirth + "\t\t\t" +"   "+ AadharCardNumber + "\t\t\t" +"  "+ strGender);
                    writer.write("\n");
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");  
                    writer.write("DOSE:1 |" +"VaccineType:"+VaccineType);
                    writer.write("\n");  
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");  
                    writer.write("Center" + "\t\t" +"      "+ "Date"  + "\t\t" + "Time");
                    writer.write("\n"); 
                    writer.write(Center + "\t\t" + rand1 + "-12-2021" + "\t" + rand2 + " PM");
                    writer.write("\n");  
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n"); 
                    writer.write("DOSE:2 |" +"VaccineType:"+VaccineType);
                    writer.write("\n");  
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");  
                    writer.write("Center" + "\t\t" +"      "+ "Date"  + "\t\t" + "Time");
                    writer.write("\n"); 
                    writer.write(Center + "\t\t" + rand1 + "-03-2022" + "\t" + rand2 + " PM");
                    writer.write("\n");  
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n"); 
                    writer.write("\n"); 
                    writer.close();
                } 
                catch (IOException e) 
                {  
                    System.out.println("Unexpected error occurred");  
                    e.printStackTrace();  
                } 
            }
            else
            {
               System.out.println("YOUR PASSWROD IS INCORRECT.ENTER IT ONCE AGAIN");
               System.out.print("ENTER YOUR PASSWORD TO BOOK YOUR SLOT FOR DOSE 2                                 : ");
               password = sc.nextLine();
               if(pass.equals(password))
            {
                try {  
                    BufferedWriter writer = new BufferedWriter(
                    new FileWriter("F:Certificate.txt", true));  
                    writer.write("\n");
                    writer.write("\n");
                    writer.write("\n");
                    writer.write("*****************************************************************************************************************************************************************************************");
                    writer.write("\n");
                    writer.write("\n");
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");
                    writer.write("\t\t\t\t\tACCOUNT DETAILS FOR DOSE 2");
                    writer.write("\n");
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");  
                    writer.write("YearOfBirth" + "\t\t" + "AadharCardNumber" + "\t\t" + "gender");
                    writer.write("\n"); 
                    writer.write("   "+YearOfBirth + "\t\t\t" +"   "+ AadharCardNumber + "\t\t\t" +"  "+ strGender);
                    writer.write("\n");
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");  
                    writer.write("DOSE:1 |" +"VaccineType:"+VaccineType);
                    writer.write("\n");  
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");  
                    writer.write("Center" + "\t\t" +"      "+ "Date"  + "\t\t" + "Time");
                    writer.write("\n"); 
                    writer.write(Center + "\t\t" + rand1 + "-12-2021" + "\t" + rand2 + " PM");
                    writer.write("\n");  
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n"); 
                    writer.write("DOSE:2 |" +"VaccineType:"+VaccineType);
                    writer.write("\n");  
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n");  
                    writer.write("Center" + "\t\t" +"      "+ "Date"  + "\t\t" + "Time");
                    writer.write("\n"); 
                    writer.write(Center + "\t\t" + rand1 + "-03-2022" + "\t" + rand2 + " PM");
                    writer.write("\n");  
                    writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    writer.write("\n"); 
                    writer.write("\n"); 
                    writer.close();
                } 
                catch (IOException e) 
                {  
                    System.out.println("Unexpected error occurred");  
                    e.printStackTrace();  
                } 
            }
            else
            {
                System.out.println("\n\tSORRY - YOU HAVE EXHAUSTED THE MAXIMUM TRIALS ..");
            }
            }
    }
}

public class Innovative extends Registration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Registration R = new Registration();
        R.Details();
        R.OtpGeneration();
        R.OtpVerification();
        Slot_Booking S = new Slot_Booking();
        S.Password_Set();
        S.Booking();
        S.Slot();
        S.Appoinment();

        R.DisplayMobileNumber();
        S.DisplayOtherDetails();

        
        System.out.print("ENTER 1 FOR BOOKING YOUR APPOINMENT FOR DOSE-2 OR 2 FOR DOSE-1 AND 3 FOR EXIT    : ");
        int Num=sc.nextInt();
        if(Num==1)
        {
           S.Dose2();
           try 
        {
            System.out.println();
            System.out.println();
            System.out.println("PLEASE WAIT YOUR CERTIFICATE IS BEING GENERATED");
            Thread.sleep(5000);
            System.out.println("YOUR CERTIFICATE IS READY PLEASE CHECK IT");   
            System.out.println();
            System.out.println(); 
        }
           catch (Exception e) 
    {
        System.out.println(e);
    } 
        }
        else if(Num==2)
        {
            main(null);
        }
        else{
            System.exit(0);
        }
    }
}       