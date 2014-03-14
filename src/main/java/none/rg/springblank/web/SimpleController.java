package none.rg.springblank.web;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.servlet.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import none.rg.springblank.service.*;
import none.rg.springblank.model.*;

@Controller
public class SimpleController {
    
    @Autowired
    private GroupService groupService;
    
    @RequestMapping("/")
    public String general() {
        return "index";
    }

    @RequestMapping("/data")
    public String withData(Model model) {
        List<Group> data = groupService.getList();
        model.addAttribute("data", data);
        return "datatable";
    }

}
