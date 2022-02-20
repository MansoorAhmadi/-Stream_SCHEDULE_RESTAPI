package com.example.stream_schedule.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiveStreamTest {

    @Test
    public void mutable_test(){
        //given - @POJO class
        MutableLiveStream stream = new MutableLiveStream();

        /**
         * UUID is a pre-existing class in JAVA, we imported it after writing it
         */
        //when - setting the attributes of the class
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Rest API using stream example");
        stream.setDescription("I found it about the UUID recently, and I doing a project called STREAM using REST API. " +
                "I found out about this Article in JetBrains tutorials. I will write my linkedin at the URL");
        stream.setUrl("https://www.linkedin.com/in/" +
                "mansoor-ahmadi-687b5620b?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BDvnjb6clSSWxkJ1zZbgrkg%3D%3D");
        stream.setStartDate(LocalDateTime.now());
        stream.setEndDate(LocalDateTime.of(2022,02,20,16,15));

        //then
        assertNotNull(stream);
        assertEquals("Rest API using stream example", stream.getTitle());
    }
}
