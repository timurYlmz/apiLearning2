package models.pet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pet {
    Long id;
    Category category;
    String name;
    List<String> photoUrls;
    List<Category> tags;
    String status;

    public Pet(){}

    public Pet(boolean defaultInitialization){
        if (defaultInitialization){
            setName("Takas");
            setStatus("sold");
            Pet.Category category = new Pet.Category();
            category.setId(0L);
            category.setName("Dogs");
            setCategory(category);
            setId(0L);
            List<Pet.Category> tags = Collections.singletonList(category);
            setTags(tags);
            List<String> photoUrls = Arrays.asList("x", "y");
            setPhotoUrls(photoUrls);
        }
    }

    public Pet(String name, String status, Long id, Category category, List<String> photoUrls, List<Category> tags){
        setPhotoUrls(photoUrls);
        setTags(tags);
        setCategory(category);
        setStatus(status);
        setId(id);
        setName(name);
    }

    public void setCategory(Category category) {this.category = category;}

    public void setId(Long id) {this.id = id;}

    public void setName(String name) {this.name = name;}

    public void setPhotoUrls(List<String> photoUrls) {this.photoUrls = photoUrls;}

    public void setStatus(String status) {this.status = status;}

    public void setTags(List<Category> tags) {this.tags = tags;}

    public Category getCategory() {return category;}

    public List<Category> getTags() {return tags;}

    public List<String> getPhotoUrls() {return photoUrls;}

    public Long getId() {return id;}

    public String getName() {return name;}

    public String getStatus() {return status;}

    public static class Category {
        Long id;
        String name;

        public void setName(String name) {this.name = name;}

        public void setId(Long id) {this.id = id;}

        public String getName() {return name;}

        public Long getId() {return id;}
    }
}
