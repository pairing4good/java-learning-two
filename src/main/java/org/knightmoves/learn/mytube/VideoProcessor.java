package org.knightmoves.learn.mytube;

public class VideoProcessor {

    private Encodable encoder;
    private Storable storage;
    private Communicatable sender;

    public VideoProcessor(Encodable encoder, Storable storage, Communicatable sender){
        this.encoder = encoder;
        this.storage = storage;
        this.sender = sender;
    }

    public void process(Video video) {
        encoder.encode(video);
        storage.store(video);
        sender.send(video.getUser());
    }
}

