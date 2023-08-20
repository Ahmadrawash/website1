package WebsiteTest4.WebsiteTest4.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class myController {

    public myController(){}

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping()
    {
        return "Ping Success";
    }

    @RequestMapping(value = "/view", method = RequestMethod.POST)
    public String viewItem(@RequestParam(value = "itemName", defaultValue = "item1") String itemName)
    {
        if (itemName.equals(""))
            return "No information ahs been passed";
        else
            return "information for itemName is " + itemName + " is right";
    }
}
