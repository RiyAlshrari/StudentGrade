package studentgrade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Riy Alshrari
 */
public class StudentGradeTest {
    
    private static int testCaseCount;
    private int mark;
    private String expectedResult;
    
    public StudentGradeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Welcome to StudentGaradeTest Class. \n");
        testCaseCount = 1;
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Good Bye! ");
        testCaseCount = 0;
    }
    
    @Before
    public void setUp() {
        System.out.print("Test Case #" + testCaseCount + "\n");
    }
    
    @After
    public void tearDown() {
        System.out.println("(Expected Result: " + expectedResult + ") (Actual Result: " + StudentGrade.getGrade(mark) +") \n");
        testCaseCount++;
    }

    /**
     * Test of getGrade methods, of class StudentGrade.
     */
    @Test
    public void testGetGrade95() {
       mark = 95;
       expectedResult = "A";
       assertEquals(expectedResult, StudentGrade.getGrade(mark));
    }
    
    @Test
    public void testGetGrade85() {
       mark = 85;
       expectedResult = "B";
       assertEquals(expectedResult, StudentGrade.getGrade(mark));
    }
    
    @Test
    public void testGetGrade75() {
       mark = 75;
       expectedResult = "F";
       assertEquals(expectedResult, StudentGrade.getGrade(mark));
    }
}
