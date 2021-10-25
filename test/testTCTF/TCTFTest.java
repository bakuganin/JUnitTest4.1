package testTCTF;
import org.junit.Test;
import perevod.perevod;
import java.util.Random;

/**
 * @author Jegor Bakunin
 */

public class TCTFTest {
    Random random = new Random();
    public TCTFTest () {
    }
    
    @Test
    public void test_perevod() {
        perevod obj = new perevod();
        double tulemus = obj.run(random.nextInt());
    }

    
}
