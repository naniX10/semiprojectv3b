package nanix.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdsController {

    @GetMapping("/pds/list")
    public String list() {
        return "pds/list.tiles";
    }

    @GetMapping("/pds/view")
    public String view() {
        return "pds/view.tiles";
    }

    @GetMapping("/pds/write")
    public String pds() {
        return "pds/write.tiles";
    }


}
