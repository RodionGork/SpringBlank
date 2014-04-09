package none.rg.springblank.dao;

import java.util.List;
import none.rg.springblank.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
    
    public List<Product> findByGroupId(Integer groupId);
    
}
