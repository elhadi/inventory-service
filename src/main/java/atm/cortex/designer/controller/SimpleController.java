package atm.cortex.designer.controller;

import atm.cortex.designer.model.Campagne;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String custom() {

        return "Hello";
    }

    @RequestMapping(value = "/campagne", method = RequestMethod.POST)
    public Campagne test(Campagne campagne) {

        return campagne;

    }


}