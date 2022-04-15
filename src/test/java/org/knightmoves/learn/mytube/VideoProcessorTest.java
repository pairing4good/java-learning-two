package org.knightmoves.learn.mytube;

import org.junit.Test;

import static org.junit.Assert.*;

public class VideoProcessorTest {

    @Test
    public void shouldProcess(){

        Loggable logger = new Logger();
        VideoEncoder encoder = new VideoEncoder(logger);
        VideoDatabase storage = new VideoDatabase(logger);
        EmailService sender = new EmailService(logger);
        VideoProcessor videoProcessor = new VideoProcessor(encoder, storage, sender);
        Video video = new Video();
        video.setFileName("test filename");
        video.setTitle("test title");
        video.setUser(new User("test@email.com"));

        videoProcessor.process(video);

        assertEquals("Encoding video...\n" +
                "Done!\n" +
                "\n" +
                "Storing video metadata in a SQL database...\n" +
                "Title: test title\n" +
                "File Name: test filename\n" +
                "Done!\n" +
                "\n" +
                "Notifying test@email.com...\n" +
                "Done!\n" +
                "\n", logger.read());
    }

}