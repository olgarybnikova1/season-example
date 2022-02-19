import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class SeasonExample {

  public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter month");
    String month = bufferedReader.readLine();

    Season season;
    switch (month.toLowerCase(Locale.ROOT)) {
      case "december":
      case "january":
      case "february":
        season = Season.WINTER;
        System.out.println(season);
        break;
      case "march":
      case "april":
      case "may":
        season = Season.SPRING;
        System.out.println(season);
        break;
      case "june":
      case "july":
      case "august":
        season = Season.SUMMER;
        System.out.println(season);
        break;
      case "september":
      case "october":
      case "november":
        season = Season.AUTUMN;
        System.out.println(season);
        break;
      default:
        System.out.println("No this month");
    }
  }
}
