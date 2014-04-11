package none.rg.springblank.service;

import none.rg.springblank.dao.GroupDao;
import none.rg.springblank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    
    @Autowired
    private GroupDao groupDao;

    @Transactional
    public List<Product> getList(Integer groupId) {
        return groupDao.getById(groupId).getProducts();
    }
}
