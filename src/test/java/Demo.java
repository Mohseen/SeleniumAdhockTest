import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
//        try{
//            int a[]=new int[5];
//            a[5]=30/1;
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Arithmetic Exception occurs");
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("ArrayIndexOutOfBounds Exception occurs");
//        }
//        catch(Exception e)
//        {
//            System.out.println("Parent Exception occurs");
//        }
//        System.out.println("rest of the code");
//    }
//        try {
//            String s = null;
//            System.out.println(s.length());
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception occurs");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBounds Exception occurs");
//        } catch (Exception e) {
//            System.out.println("Parent Exception occurs");
//        }
//        System.out.println("rest of the code");
//        try{
//            int a[]=new int[5];
//            a[5]=30/0;
//        }
//        catch(Exception e){System.out.println("common task completed");}
//        catch(ArithmeticException e){System.out.println("task1 is completed");}
//        catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
//        System.out.println("rest of the code...");
//        String String = "Hello";
//        String s2 = new String("Hello");
//        System.out.println(String == s2);
//        System.out.println(s2.equals(s2));
//        int x = 8;
//        boolean h = null;

        try {
            int a = 10/0;
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }
    }
}
