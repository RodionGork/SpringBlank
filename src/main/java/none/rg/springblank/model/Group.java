package none.rg.springblank.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="groups")
public class Group {

    @Id
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "group")
    private List<Product> products;

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
