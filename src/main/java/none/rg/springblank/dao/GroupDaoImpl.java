package none.rg.springblank.dao;

import org.springframework.stereotype.*;

import java.util.*;

import none.rg.springblank.model.*;

@Repository
public class GroupDaoImpl implements GroupDao {

    public List<Group> getList() {
        return Arrays.asList(newGroup(1, "Grocery"), newGroup(2, "Drinks"));
    }
    
    private Group newGroup(Integer id, String name) {
        Group g = new Group();
        g.setId(id);
        g.setName(name);
        return g;
    }

}

