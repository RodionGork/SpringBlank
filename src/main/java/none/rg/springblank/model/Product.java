package none.rg.springblank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer groupId;

    @Column
    private Integer price;
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setGroupId(Integer id) {
        this.groupId = id;
    }
    
    public Integer getGroupId() {
        return groupId;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
    
}

