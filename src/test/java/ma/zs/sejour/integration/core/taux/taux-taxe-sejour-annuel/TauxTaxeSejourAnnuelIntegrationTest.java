package ma.zs.sejour.integration.core.taux.taux-taxe-sejour-annuel;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class TauxTaxeSejourAnnuelIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("TauxTaxeSejourAnnuelHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
