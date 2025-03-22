package ch8.movestatementstocallers;

import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.List;

public class PrintHTML {


    public  void renderPerson(OutputStream outStream, Person person ) throws IOException {
        outStream.write(String.format("<p> %s </p>", person.name).getBytes());
        renderPhoto(outStream, person.photo);
        emitPhotoData(outStream, person.photo);
    }

    private void emitPhotoData(OutputStream outStream, Photo photo) throws IOException {
        zztmp(outStream, photo);
        outStream.write(String.format("<p> 위치: %s </p>", photo.location).getBytes());
    }

    private void zztmp(OutputStream outStream, Photo photo) throws IOException {
        outStream.write(String.format("<p> 제목: %s </p>", photo.title).getBytes());
        outStream.write(String.format("<p> 날짜: %s </p>", photo.date.toString()).getBytes());
    }

    private void renderPhoto(OutputStream outStream, Photo photo) {

    }

    public void listRecentPhotos(OutputStream outStream, List<Photo> photos)  {
        photos.stream()
                .filter(p -> p.date.isAfter(recentDateCutoff()))
                .forEach(p -> {
                    try {
                        outStream.write("<div>\n".getBytes());
                        emitPhotoData(outStream, p);
                        outStream.write("</div>\n".getBytes());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    private LocalDateTime recentDateCutoff() {
        return LocalDateTime.now().minusMonths(1);
    }

}
