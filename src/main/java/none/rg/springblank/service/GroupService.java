package none.rg.springblank.service;

import none.rg.springblank.dao.GroupDao;
import none.rg.springblank.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroupService {
    
    @Autowired
    private GroupDao groupDao;

    @Transactional
    public List<Group> getList() {
        return groupDao.getList();
    }

    @Transactional
    public Group getById(int id) {
        return groupDao.getById(id);
    }

}

