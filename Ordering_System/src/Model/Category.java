package Model;

import Model.Main_Category;

public class Category extends Main_Category {
    String category_name;

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Category(String name, String category_name) {
        super(name);
        this.category_name = category_name;
    }
}