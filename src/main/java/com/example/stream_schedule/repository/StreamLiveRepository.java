package com.example.stream_schedule.repository;

import com.example.stream_schedule.exception.LiveStreamNotFoundException;
import com.example.stream_schedule.model.LiveStreamRecord;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class StreamLiveRepository {

    /**
     * initialising an empty list
     */
    List<LiveStreamRecord> streams = new ArrayList<>();

    /**
     * @method - to add new entries in the initialised list
     * @constructor - StreamLiveRepository()
     * @body - Record class attributes
     */
    public StreamLiveRepository() {
        streams.add(new LiveStreamRecord(
                UUID.randomUUID().toString(), ("Rest API using RECORD CLASS example"), ("I found it about the UUID recently, " +
                "and I doing a project called STREAM using REST API. " +
                "I found out about this Article in JetBrains tutorials. " +
                "I will write my linkedin at the URL"), ("https://www.linkedin.com/in/" +
                "mansoor-ahmadi-687b5620b?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BDvnjb6clSSWxkJ1zZbgrkg%3D%3D"),
                (LocalDateTime.now()), (LocalDateTime.of(2022,02,20,16,15)))
        );
    }

    /**
     * @method - to show a list
     * @return - a list of all the available streams
     */
    public List<LiveStreamRecord> findAll() {
        return streams;
    }

    /**
     * @method - getting a Live Stream by id
     * @param id -
     * @return
     * @throws LiveStreamNotFoundException class extends Exception with @ResponseHttp status
     */
    public LiveStreamRecord findById(String id) throws LiveStreamNotFoundException {
        return streams.stream().filter(stream -> stream.id().equals(id)).findFirst().orElseThrow(LiveStreamNotFoundException::new);
    }

    /**
     * @method - to create or add a stream
     * @Post -
     * @param stream
     * @return - returning the created stream
     */
    public LiveStreamRecord create(LiveStreamRecord stream) {
        streams.add(stream);
        return stream;
    }

    /**
     * @method - to update a live stream
     * @param stream
     * @param id - filtering by id
     */
    public void update(LiveStreamRecord stream, String id) {
        LiveStreamRecord existing = streams.stream().filter(s -> s.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Stream by id not found"));
        int i = streams.indexOf(existing);
        streams.set(i, stream);
    }

    /**
     * @method - to delete a stream by id
     * @param id - remove the stream if the stream matches the id
     */
    public void delete(String id) {
        streams.removeIf(stream -> stream.id().equals(id));
    }
}
