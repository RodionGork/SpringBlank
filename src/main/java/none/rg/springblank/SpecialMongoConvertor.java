package none.rg.springblank;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.stereotype.Component;

@Component("mongoConvertor")
public class SpecialMongoConvertor extends MappingMongoConverter {

    @Autowired
    public SpecialMongoConvertor(MongoDbFactory factory) {
        super(factory, new MongoMappingContext());
        this.setTypeMapper(new DefaultMongoTypeMapper(null));
    }

}
