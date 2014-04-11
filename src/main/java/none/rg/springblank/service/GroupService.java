package none.rg.springblank.service;

import none.rg.springblank.dao.GroupDao;
import none.rg.springblank.dao.ProductDao;
import none.rg.springblank.model.Group;
import none.rg.springblank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroupService {
    
    @Autowired
    private GroupDao groupDao;
    @Autowired
    ProductDao productDao;

    @Transactional
    public List<Group> getList() {
        List<Group> list = groupDao.getList();
        list.size();
        return list;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Group getById(int id) {
        return groupDao.getById(id);
    }

    @Transactional
    public void addProduct(String name, Integer price, Integer groupId) {
        Group g = getById(groupId);
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        p.setGroup(g);
        g.getProducts().add(p);
        groupDao.save(g);
    }

}

