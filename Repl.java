import exercise2.DateRangeTest;
import exercise3.ReverseStringTest;
import exercise4.PalindromeTest;
import exercise5.Pyramid;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Repl {


    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        System.out.println("Running tests:");
        System.out.println();
        System.out.println("ShoppingSiteTest SKIP! Sudo code exercise");
		System.out.println("------------------------------------------------");
        runTestCase(DateRangeTest.class);
        runTestCase(ReverseStringTest.class);
        runTestCase(PalindromeTest.class);
        Pyramid.printPyramid(5);
        System.out.println("------------------------------------------------");
    }

    private static void runTestCase(Class testCase) {
        Result result = JUnitCore.runClasses(testCase);
        if (result.wasSuccessful()) {
            System.out.println(testCase.getSimpleName() + " PASS! (total: " + result.getRunCount() + ")");
        } else {
            System.out.println(testCase.getSimpleName() + " FAIL! (failure: " + result.getFailures().size() + " | total: " + result.getRunCount() + ")");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
        System.out.println("------------------------------------------------");
    }

}
