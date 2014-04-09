package none.rg.springblank.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import none.rg.springblank.model.*;

public interface ShelfRepository extends MongoRepository<Shelf, Integer> {

}

