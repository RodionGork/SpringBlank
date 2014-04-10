package none.rg.springblank.dao;

import none.rg.springblank.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Product> getList(Integer groupId) {
        if (groupId != null) {
            return sessionFactory.getCurrentSession().createQuery("from Product p where groupId = :g")
                    .setParameter("g", groupId).list();
        } else {
            throw new UnsupportedOperationException();
        }
    }
    
    private Product newProduct(Integer id, String name, Integer groupId, Integer price) {
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setGroupId(groupId);
        p.setPrice(price);
        return p;
    }
}
