package edu.northeastern.yanxuan;

import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) {
        drivingLicenseApplication();
    }

    private static void drivingLicenseApplication() {

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

        Date nowDate = new Date();

        Date date = new Date(year + 16 - 1900, month - 1, day);

        try {
            if (date.after(nowDate)) {
                throw new Exception("Over Age");
            }

        } catch (Exception e) {
            System.out.println("The age of the applicant is 14 which is too early to apply for a driving license");
        }


    }
}
