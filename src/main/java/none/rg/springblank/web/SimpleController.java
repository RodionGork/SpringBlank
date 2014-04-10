package none.rg.springblank.web;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import none.rg.springblank.service.*;
import none.rg.springblank.model.*;

@Controller
public class SimpleController {
    
    @Autowired
    private GroupService groupService;
    
    @Autowired
    private ProductService productService;
    
    @RequestMapping("/")
    public String general() {
        return "index";
    }

    @RequestMapping("/groups")
    public String getGroups(Model model) {
        List<Group> data = groupService.getList();
        model.addAttribute("groupList", data);
        return "groups";
    }
    
    @RequestMapping("/products")
    public String getProducts(
            @RequestParam(value="g", required=true) Integer groupId,
            Model model) {
        Group group = groupService.getById(groupId);
        List<Product> data = productService.getList(groupId);
        model.addAttribute("productList", data);
        model.addAttribute("groupName", group.getName());
        return "products";
    }
}
