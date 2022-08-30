package com.example.publisherapp.service.interfaces;

import com.example.publisherapp.model.Publisher;

import java.util.List;

public interface PublisherService {
    public Publisher addPublisher(int msisdn);
    public List<Publisher> getAllPublisher();
    public Publisher updatePublisher(Long publisherId, int msisdn);
    public void deletePublisher(Long publisherId);
}
