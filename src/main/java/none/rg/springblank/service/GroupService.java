package none.rg.springblank.service;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

import java.util.*;

import none.rg.springblank.dao.*;
import none.rg.springblank.model.*;

@Service
public class GroupService {
    
    @Autowired
    private ShelfRepository groupRepo;
    
    public List<Shelf> getList() {
        return groupRepo.findAll();
    }
    
    public Shelf getById(int id) {
        return groupRepo.findOne(id);
    }

}

