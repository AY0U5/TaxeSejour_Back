package ma.zs.sejour.integration.core.Taxe.taxe-sejour-annuel-detail;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class TaxeSejourAnnuelDetailIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("TaxeSejourAnnuelDetailHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
