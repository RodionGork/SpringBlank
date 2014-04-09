package none.rg.springblank.model;

public class Product {

    private Integer id;
    private String name;
    private Integer groupId;
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
    
    public void setShelf(Integer id) {
        this.groupId = id;
    }
    
    public Integer getShelfId() {
        return groupId;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
    
}

