package ch12.replacesuperclasswithdelegate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.List;

public class Scroll extends CatalogItem{

    private LocalDateTime lastCleaned;
    public Scroll(Long id, String title, List<String> tags, LocalDateTime dateLastCleaned) {
        super(id, title, tags);
        this.lastCleaned = dateLastCleaned;
    }

    public boolean needsCleaning(LocalDateTime targetDate) {
        long threshold = this.hasTag("revered") ? 700 : 1500;
        return this.daysSinceLastCleaning(targetDate) > threshold;
    }

    private long daysSinceLastCleaning(LocalDateTime targetDate) {
        return this.lastCleaned.until(targetDate, ChronoUnit.DAYS);
    }


}
