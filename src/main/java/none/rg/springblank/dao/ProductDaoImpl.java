package none.rg.springblank.dao;

import none.rg.springblank.model.Group;
import none.rg.springblank.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Product newProduct(Integer id, String name, Group group, Integer price) {
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setGroup(group);
        p.setPrice(price);
        return p;
    }
}
