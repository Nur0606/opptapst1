import java.awt.geom.Area;
import java.time.LocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Company company = new Company("apple","amerika",2007,"Стивом Джонсон");
Group group = new Group("samsung", LocalDate.of(1938,3,1),"ментора не знаю ");
Person person = new Person("no","no",LocalDate.of(2006,22,11));
        System.out.println(company);
        System.out.println(group);
        System.out.println(person);

        }
    }
