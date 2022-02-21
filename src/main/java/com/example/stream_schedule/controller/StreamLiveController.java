package com.example.stream_schedule.controller;

import com.example.stream_schedule.exception.LiveStreamNotFoundException;
import com.example.stream_schedule.model.LiveStreamRecord;
import com.example.stream_schedule.repository.StreamLiveRepository;
import jdk.incubator.vector.LongVector;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @RestController - makes the class a controller class. - We told Rest that this class is going to be a RestController
 * @Controller & @ResponseBody is inside @RestController
 * @Controller - the purpose of a controller is to accept requests and send responses
 * @RequestMapping - everything below the annotation will be under /stream - crud operations
 */

@RestController
@RequestMapping("/stream")
public class StreamLiveController {


    /**
     * dependency injection and initialisation
     */
    private final StreamLiveRepository repository;

    public StreamLiveController(StreamLiveRepository repository) {
        this.repository = repository;
    }


    /**
     * @param - a special @GetMapping request to return the find all value
     * GET - http://localhost:8080/stream
     * @return -
     */
    @GetMapping
    public List<LiveStreamRecord> findAll(){
        return repository.findAll();
    }

    /**
     * @param id - a special @GetMapping responds to the request by id
     * GET - http://localhost:8080/stream/1242-2342-234234-234234    -find by id
     * @return - return an exact value
     * @PathVariable - will pull the String id that we have created
     */
    @GetMapping("{id}")
    public LiveStreamRecord findById(@PathVariable String id) throws LiveStreamNotFoundException {
        return repository.findById(id);
    }

    /**
     * @ReponseStatus - an acknowledgment when created with 202 or 404 not found
     * @PostMapping - to create a stream
     * @param stream
     * @return
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStreamRecord create(@RequestBody LiveStreamRecord stream){
        return repository.create(stream);
    }

    /**
     * @ResponseStatus(HttpStatus.NO_CONTENT) - means we don't acknowledge if the update is successful
     * @param stream
     * @param id
     * @PutMapping(http://localhost:8080/stream/1242-2342-234234-234234)
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping({"/{id}"})
    public void update(@RequestBody LiveStreamRecord stream, @PathVariable String id){
        repository.update(stream, id);
    }

    /**
     * @ResponseStatus(HttpStatus.NO_CONTENT) - means we don't acknowledge if the deletion is successful
     * @param id - delete by id
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        repository.delete(id);
    }

}
