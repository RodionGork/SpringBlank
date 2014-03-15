package none.rg.springblank.service;

import java.util.List;
import none.rg.springblank.dao.ProductDao;
import none.rg.springblank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductDao productDao;
    
    public List<Product> getList(Integer groupId) {
        return productDao.getList(groupId);
    }
}
