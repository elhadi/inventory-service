package atm.cortex.designer.controller;

import atm.cortex.designer.model.Campaign;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {


    @RequestMapping(value = "/campagne", method = RequestMethod.POST)
    public Campaign test(@RequestBody Campaign campagne) {
        //campagne.setNom("Tata");
        return campagne;
    }


}