package none.rg.springblank;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.servlet.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class SimpleController {

    @RequestMapping("/")
    public String general() {
        return "index";
    }

    @RequestMapping("/data")
    public String withData(Model model) {
        model.addAttribute("data", "DataSample");
        return "datatable";
    }

}
