package com.example.stream_schedule.controller;

import com.example.stream_schedule.model.LiveStreamRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * @param - a special @GetMapping request to return the find all value
     * GET - http://localhost:8080/stream
     * @return -
     */
    @GetMapping
    public List<LiveStreamRecord> findAll(){
        return null;
    }




}
