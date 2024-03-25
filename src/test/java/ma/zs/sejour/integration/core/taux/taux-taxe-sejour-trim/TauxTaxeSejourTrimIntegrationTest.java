package ma.zs.sejour.integration.core.taux.taux-taxe-sejour-trim;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class TauxTaxeSejourTrimIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("TauxTaxeSejourTrimHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
