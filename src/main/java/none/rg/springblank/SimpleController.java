package none.rg.springblank;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.servlet.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class SimpleController {

    @RequestMapping("/")
    public String general() {
        return "index";
    }

    @RequestMapping("/data")
    public String withData(Model model) {
        List<String> data = Arrays.asList("Meat", "Milk", "Beer", "Bread");
        model.addAttribute("data", data);
        return "datatable";
    }

}
