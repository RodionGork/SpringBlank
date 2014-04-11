package none.rg.springblank.web;

import none.rg.springblank.model.Group;
import none.rg.springblank.model.Product;
import none.rg.springblank.service.GroupService;
import none.rg.springblank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    public String listGroups(Model model) {
        List<Group> data = groupService.getList();
        model.addAttribute("groupList", data);
        return "groups";
    }
    
    @RequestMapping("/products")
    public String showGroup(Model model, @RequestParam(value="g", required=true) Integer groupId) {
        Group group = groupService.getById(groupId);
        List<Product> data = productService.getList(groupId);
        model.addAttribute("productList", data);
        model.addAttribute("groupName", group.getName());
        return "products";
    }

    @RequestMapping("/viewproduct")
    public String showProduct(Model model,
            @RequestParam(value="p", required=true) Integer productId) {
        Product product = productService.getById(productId);
        model.addAttribute("product", product);
        return "viewproduct";
    }
}
