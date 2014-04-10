package none.rg.springblank.dao;

import none.rg.springblank.model.Group;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroupDaoImpl implements GroupDao {

    public GroupDaoImpl() {
        System.err.println("GROUP_DAO INSTANTIATED");
    }

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Group getById(int groupId) {
        return (Group) sessionFactory.getCurrentSession().createQuery("from Group g where id = :id")
                .setParameter("id", groupId).uniqueResult();
    }
    
    @Override
    public List<Group> getList() {
        return sessionFactory.getCurrentSession().createQuery("from Group g").list();
    }

    private Group newGroup(Integer id, String name) {
        Group g = new Group();
        g.setId(id);
        g.setName(name);
        return g;
    }
    
}
