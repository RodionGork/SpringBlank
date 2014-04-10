package none.rg.springblank.dao;

import java.util.*;

import none.rg.springblank.model.*;

public interface GroupDao {

    public List<Group> getList();
    
    public Group getById(int id);

}

