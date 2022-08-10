package com.example.publisherapp.service.implementations;

import com.example.publisherapp.repository.PublisherRepository;
import com.example.publisherapp.service.interfaces.PublisherService;
import lombok.RequiredArgsConstructor;
import com.example.publisherapp.model.Publisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherServiceImp implements PublisherService {

    private final PublisherRepository publisherRepository;

    @Override
    public Publisher getPublisher() {
        return publisherRepository.generatePublisher();
    }
}
