package cortex.designer.service.test;


import atm.cortex.designer.Application;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Application.class})
public class CampaignTest {




    @Test
    public void testCampaign(){


        Assertions.assertThat("X"=="XX");


    }



}