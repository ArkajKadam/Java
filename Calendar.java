import java.util.Scanner;

public class Calendar {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day (dd): ");
        int dd = scanner.nextInt();

        System.out.println("Enter the month (mm): ");
        int mm = scanner.nextInt();

        System.out.println("Enter the year (yyyy): ");
        int yy = scanner.nextInt();

        int m_day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) {
            m_day[2] = 29;
        }
        if (mm < 1 || mm > 12) {
            System.out.println("Invalid date: Month must be between 1 and 12");
            return;
        }

        if (dd < 1 || dd > m_day[mm]) {
            System.out.println("Invalid date: Day must be between 1 and " + m_day[mm]);
            return;
        }
        int day_passed = dd;
        for (int i = 1; i < mm; i++) {
            day_passed += m_day[i];
        }
        int total_days = (yy - 1) * 365 + (yy - 1) / 4 - (yy - 1) / 100 + (yy - 1) / 400 + day_passed;
int t_odddays = total_days % 7;
        System.out.println("Number of odd days are " + t_odddays);

        switch (t_odddays) {
            case 0:
                System.out.println("The day is Sunday");
                break;
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
        }

        scanner.close();
    }
}