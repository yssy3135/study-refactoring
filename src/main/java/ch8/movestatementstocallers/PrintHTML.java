package ch8.movestatementstocallers;

import java.io.IOException;
import java.io.OutputStream;

public class PrintHTML {


    public  void renderPerson(OutputStream outStream, Person person ) throws IOException {
        outStream.write(String.format("<p> %s </p>", person.name).getBytes());
        renderPhoto(outStream, person.photo);
        emitPhotoData(outStream, person.photo);
    }

    private void emitPhotoData(OutputStream outStream, Photo photo) throws IOException {
        outStream.write(String.format("<p> 제목: %s </p>", photo.title).getBytes());
        outStream.write(String.format("<p> 날짜: %s </p>", photo.date.toString()).getBytes());
        outStream.write(String.format("<p> 위치: %s </p>", photo.location).getBytes());
    }

    private void renderPhoto(OutputStream outStream, Photo photo) {

    }


}
