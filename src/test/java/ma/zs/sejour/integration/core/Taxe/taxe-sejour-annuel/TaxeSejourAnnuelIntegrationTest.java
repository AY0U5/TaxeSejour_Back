package ma.zs.sejour.integration.core.Taxe.taxe-sejour-annuel;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class TaxeSejourAnnuelIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("TaxeSejourAnnuelHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
