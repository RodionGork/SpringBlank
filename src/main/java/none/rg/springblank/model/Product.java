package none.rg.springblank.model;

public class Product {

    private Integer id;
    private String name;
    private Integer groupId;
    
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
    
}

