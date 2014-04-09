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
        List<Shelf> data = groupService.getList();
        model.addAttribute("shelfList", data);
        return "groups";
    }
    
    @RequestMapping("/products")
    public String getProducts(
            @RequestParam(value="g", required=true) Integer groupId,
            Model model) {
        Shelf group = groupService.getById(groupId);
        List<Product> data = productService.getList(groupId);
        model.addAttribute("productList", data);
        model.addAttribute("group", group);
        return "products";
    }

    @RequestMapping("/addprod")
    public String addProduct(@RequestParam("id") Integer id, @RequestParam("name") String name,
            @RequestParam("price") Integer price, @RequestParam("groupid") Integer groupId,
            Model model) {
        productService.addProduct(id, name, price, groupId);
        return "redirect:products?g=" + groupId;
    }
}
