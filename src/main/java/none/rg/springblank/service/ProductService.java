package none.rg.springblank.service;

import none.rg.springblank.dao.ProductDao;
import none.rg.springblank.model.Group;
import none.rg.springblank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    
    @Autowired
    private ProductDao productDao;

    @Autowired
    private GroupService groupService;

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<Product> getList(Integer groupId) {
        return groupService.getById(groupId).getProducts();
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Product getById(Integer productId) {
        return productDao.getById(productId);
    }

}
