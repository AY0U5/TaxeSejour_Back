package ma.zs.sejour.integration.core.Taxe.taxe-sejour-trim;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class TaxeSejourTrimIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("TaxeSejourTrimHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
