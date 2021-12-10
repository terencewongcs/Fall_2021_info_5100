package edu.northeastern.yanxuan;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) throws Exception {
        getDateOfBirthFromUser();
    }

    private static void getDateOfBirthFromUser() throws Exception {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Driver's Birth Year(YYYY): ");
        String strYear = myObj.nextLine();
        int year = Integer.parseInt(strYear);

        System.out.println("Enter Driver's Birth Month(MM): ");
        String strMonth = myObj.nextLine();
        int month = Integer.parseInt(strMonth);

        System.out.println("Enter Driver's Birth Date(DD)");
        String strDate = myObj.nextLine();
        int day = Integer.parseInt(strDate);

        Date dateNow = new Date();

        Date date = new GregorianCalendar(year, month -1, day).getTime();

        int difference = (int) ChronoUnit.DAYS.between( date.toInstant(), dateNow.toInstant());


        if(365* 16 > difference) {
            throw new Exception("The age of the applicant is too early to apply for a driving license!");
        }
        else {
            System.out.println("Successful!");
        }

    }
}
