package none.rg.springblank.dao;

import none.rg.springblank.model.Group;

import java.util.List;

public interface GroupDao {

    public List<Group> getList();
    
    public Group getById(int id);

    void save(Group g);
}

