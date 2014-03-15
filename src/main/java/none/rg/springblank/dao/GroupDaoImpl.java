package none.rg.springblank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.*;

import java.util.*;
import javax.sql.DataSource;

import none.rg.springblank.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

@Repository
public class GroupDaoImpl extends JdbcDaoSupport implements GroupDao {
    
    @Autowired
    public GroupDaoImpl(DataSource ds) {
        setDataSource(ds);
    }
    
    private RowMapper<Group> rowMapper = new RowMapper() {
        @Override
        public Object mapRow(ResultSet rs, int i) throws SQLException {
            return newGroup(rs.getInt("id"), rs.getString("name"));
        }
    };
    
    @Override
    public Group getById(int groupId) {
        return getJdbcTemplate().queryForObject(
                "select * from groups where id = ?", rowMapper, groupId);
    }
    
    @Override
    public List<Group> getList() {
        return getJdbcTemplate().query(
                "select * from groups", rowMapper);
    }
    
    private Group newGroup(Integer id, String name) {
        Group g = new Group();
        g.setId(id);
        g.setName(name);
        return g;
    }
    
}
