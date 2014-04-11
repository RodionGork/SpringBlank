package none.rg.springblank.dao;

import none.rg.springblank.model.Group;
import none.rg.springblank.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Product getById(int id) {
        return (Product) sessionFactory.getCurrentSession().createQuery("from Product p where id = :id")
                .setParameter("id", id).uniqueResult();
    }

    @Override
    public void save(Product p) {
        sessionFactory.getCurrentSession().saveOrUpdate(p);
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
