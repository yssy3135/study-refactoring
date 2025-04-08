package ch12.replacesuperclasswithdelegate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.List;
import java.util.function.Function;

public class Scroll {

    private LocalDateTime lastCleaned;
    private CatalogItem catalogItem;

    public Scroll(Long id, LocalDateTime dateLastCleaned, Long catalogId, Function<Long, CatalogItem> catalog) {
        catalogItem = catalog.apply(catalogId);
        this.lastCleaned = dateLastCleaned;
    }

    public boolean needsCleaning(LocalDateTime targetDate) {
        long threshold = this.hasTag("revered") ? 700 : 1500;
        return this.daysSinceLastCleaning(targetDate) > threshold;
    }

    private long daysSinceLastCleaning(LocalDateTime targetDate) {
        return this.lastCleaned.until(targetDate, ChronoUnit.DAYS);
    }

    public Long getId() {
        return catalogItem.getId();
    }

    public String getTitle() {
        return catalogItem.getTitle();
    }

    public boolean hasTag(String tag) {
        return catalogItem.hasTag(tag);
    }


}
