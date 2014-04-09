package none.rg.springblank.model;

import org.springframework.data.annotation.Id;

public class Shelf {

    @Id
    private Integer id;

    private String name;
    
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

}
