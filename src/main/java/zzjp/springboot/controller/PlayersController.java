package zzjp.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ralink on 22.03.17.
 */

@RestController
@RequestMapping("api/v1/players/")
public class PlayersController {

    @RequestMapping(value ="", method = RequestMethod.GET)
    public String welcome()
    {
        return "DartsAppWelcome";
    }

}
