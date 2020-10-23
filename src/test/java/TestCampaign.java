import atm.cortex.designer.model.Campaign;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

import java.util.Calendar;

import java.util.Date;

@SpringBootTest
@Configuration()
public class TestCampaign {
    Campaign discount = new Campaign();
        @Test
        public void testStatusDateExpiredCampaign() {

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE,1);
            discount.setEnd_date(cal.getTime());

            Campaign discount = new Campaign();
            boolean check = discount.dateStatusExpired(discount);

            Assert.isTrue(check, "ok");

        }

}
