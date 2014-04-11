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

    public Product getById(int id) {
        return (Product) sessionFactory.getCurrentSession().createQuery("from Product p where id = :id")
                .setParameter("id", id).uniqueResult();
    }

    private Product newProduct(Integer id, String name, Group group, Integer price) {
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setGroup(group);
        p.setPrice(price);
        return p;
    }
}
