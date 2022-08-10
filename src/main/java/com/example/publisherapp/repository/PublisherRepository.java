package com.example.publisherapp.repository;

import com.example.publisherapp.enums.Action;
import com.example.publisherapp.model.Publisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
@Slf4j
public class PublisherRepository {
    private static final Random random = new Random();
    private final int min = 100000000;
    private final int max = 999999999;

    public Publisher generatePublisher() {
        log.info("Start to generate publisher");
        Publisher publisher = Publisher.builder()
                .msisdn(random.nextInt(max - min) + 1)
                .action(Action.getRandomAction())
                .timestamp(System.currentTimeMillis())
                .build();
        return publisher;
    }
}
