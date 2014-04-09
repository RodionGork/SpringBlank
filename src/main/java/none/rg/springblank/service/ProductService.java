package none.rg.springblank.service;

import java.util.List;
import none.rg.springblank.dao.ProductRepository;
import none.rg.springblank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepo;
    
    public List<Product> getList(Integer groupId) {
        return productRepo.findByGroupId(groupId);
    }

    public void addProduct(int id, String name, int price, int groupId) {
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setPrice(price);
        p.setShelf(groupId);
        productRepo.save(p);
    }
}
