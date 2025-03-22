package ch8.movestatementsintofunction;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintHTML {

    public String renderPeron(OutputStream outputStream, Person person) {
        List<String> result = new ArrayList<>();
        result.add(String.format("<p> %s </p>", person.name));
        result.add(renderPhoto(person.photo));
        result.add(String.format("<p> 제목: %s </p>", person.photo.title));
        result.add(emitPhotoData(person.photo));
        return String.join("\n", result);
    }

    public String renderPhoto(Photo photo) {
        return null;
    }

    public String photoDiv(Photo photo) {
        List<String> result = new ArrayList<>();
        result.add("<div>");
        result.add(String.format("<p> 제목: %s </p>", photo.title));
        result.add(emitPhotoData(photo));
        result.add("</div>");
        return String.join("\n", result);
    }

    private String emitPhotoData(Photo photo) {
        List<String> result = new ArrayList<>();
        result.add(String.format("<p> 위치: %s </p>", photo.location));
        result.add(String.format("<p> 날짜: %s </p>", photo.date.toString()));
        return String.join("\n", result);
    }

}
