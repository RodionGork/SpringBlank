package none.rg.springblank.dao;

import java.util.List;
import none.rg.springblank.model.Product;

public interface ProductDao {
    
    public List<Product> getList(Integer groupId);
    
}
