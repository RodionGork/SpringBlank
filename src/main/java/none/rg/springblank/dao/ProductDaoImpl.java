package none.rg.springblank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import none.rg.springblank.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl extends JdbcDaoSupport implements ProductDao {
    
    private RowMapper<Product> rowMapper = new RowMapper<Product>() {
        @Override
        public Product mapRow(ResultSet rs, int i) throws SQLException {
            return newProduct(rs.getInt("id"), rs.getString("name"),
                    rs.getInt("groupid"), rs.getInt("price"));
        }
        
    };
    
    @Autowired
    public ProductDaoImpl(DataSource ds) {
        setDataSource(ds);
    }

    @Override
    public List<Product> getList(Integer groupId) {
        if (groupId != null) {
            return getJdbcTemplate().query("select * from products where groupid = ?", rowMapper, groupId);
        } else {
            throw new UnsupportedOperationException();
        }
    }
    
    private Product newProduct(Integer id, String name, Integer groupId, Integer price) {
        Product p = new Product();
        p.setId(id);
        p.setName(name);
        p.setGroupId(groupId);
        p.setPrice(price);
        return p;
    }
}
