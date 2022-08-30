package com.example.publisherapp.service.implementations;

import com.example.publisherapp.enums.Action;
import com.example.publisherapp.repository.PublisherRepository;
import com.example.publisherapp.service.interfaces.PublisherService;
import lombok.RequiredArgsConstructor;
import com.example.publisherapp.model.Publisher;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PublisherServiceImp implements PublisherService {

    private final PublisherRepository publisherRepository;

    @Override
    public Publisher addPublisher(int msisdn) {
        Publisher publisher = Publisher.builder()
                .action(Action.getRandomAction())
                .msisdn(msisdn)
                .timestamp(System.currentTimeMillis())
                .build();

        return publisherRepository.save(publisher);
    }

    @Override
    public List<Publisher> getAllPublisher() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher updatePublisher(Long publisherId, int msisdn) {
        Publisher publisher = publisherRepository.findById(publisherId).orElseThrow(EntityNotFoundException::new);
        publisher.setMsisdn(msisdn);
        return publisherRepository.saveAndFlush(publisher);
    }

    @Override
    public void deletePublisher(Long publisherId) {
        publisherRepository.deleteById(publisherId);
    }
}
