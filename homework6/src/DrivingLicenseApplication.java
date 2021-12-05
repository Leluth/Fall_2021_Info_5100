import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: DrivingLicenseApplication
 * @date 2021/12/5 10:48
 */
public class DrivingLicenseApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your date of birth in yyyy-MM-dd format:");
        try {
            Date birthOfDate = new SimpleDateFormat("yyyy-MM-dd").parse(scanner.nextLine());
            int age = getAge(birthOfDate);
            if (age < 16) {
                throw new Exception("The age of the applicant is " + age +
                        " which is too early to apply for a driving license");
            } else {
                System.out.println("The age is qualified!");
            }
        } catch (ParseException parseException) {
            System.out.println("Date format error, please enter your date of birth in yyyy-MM-dd format");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getAge(Date birthOfDate) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getTimeInMillis() < birthOfDate.getTime()) {
            throw new IllegalArgumentException("The birthday is after now. It's unbelievable!");
        }
        int yearNow = calendar.get(Calendar.YEAR);
        int monthNow = calendar.get(Calendar.MONTH);
        int dayOfMonthNow = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.setTime(birthOfDate);
        int yearBirth = calendar.get(Calendar.YEAR);
        int monthBirth = calendar.get(Calendar.MONTH);
        int dayOfMonthBirth = calendar.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;
        if (monthNow < monthBirth || (monthNow == monthBirth && dayOfMonthNow < dayOfMonthBirth)) {
            age--;
        }
        return age;
    }
}
