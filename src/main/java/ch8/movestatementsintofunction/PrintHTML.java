package ch8.movestatementsintofunction;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class PrintHTML {

    public String renderPeron(OutputStream outputStream, Person person) {
        List<String> result = new ArrayList<>();
        result.add(String.format("<p> %s </p>", person.name));
        result.add(renderPhoto(person.photo));
        result.addAll(emotionPhotoData(person.photo));
        return String.join("\n", result);
    }

    public String renderPhoto(Photo photo) {
        return null;
    }

    public String photoDiv(Photo photo) {
        List<String> result = new ArrayList<>();
        result.add("<div>");
        result.addAll(emotionPhotoData(photo));
        result.add("</div>");
        return String.join("\n", result);
    }


    public List<String> emotionPhotoData(Photo p) {
        return List.of(
                String.format("<p> 제목: %s </p>", p.title),
                String.format("<p> 위치: %s </p>", p.location),
                String.format("<p> 날짜: %s </p>", p.date.toString())
        );
    }

}
