
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import launched.*;

public class TestList {


    @Before
    public void startGoogle() {
        Browser.open();
    }

    @After
    public void closeChrome() {
       Browser.close();
    }
    @Test
    public void testList() {

    }
    @Test
    public void testList1() {
        System.out.println("Hello");
    }


}
