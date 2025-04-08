package ch12.replacesuperclasswithdelegate;

import java.util.List;

public class CatalogItem {

    private Long id;
    private String title;
    private List<String> tags;

    public CatalogItem(Long id, String title, List<String> tags) {
        this.id = id;
        this.title = title;
        this.tags = tags;
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasTag(String tag) {
        return tags.contains(tag);
    }

}
