package com.example.publisherapp.controller;

import com.example.publisherapp.service.interfaces.PublisherService;
import lombok.RequiredArgsConstructor;
import com.example.publisherapp.model.Publisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/publisher")
public class PublisherController {
    private final PublisherService publisherService;

    @GetMapping
    public ResponseEntity<List<Publisher>> getAllPublishers() {
        return ResponseEntity.ok().body(publisherService.getAllPublisher());
    }

    @PostMapping
    @RequestMapping("/{msisdn}")
    public ResponseEntity<Publisher> addPublisher(@PathVariable int msisdn) {
        return ResponseEntity.ok().body(publisherService.addPublisher(msisdn));
    }

    @PutMapping
    @RequestMapping("/{publisherId}/{msisdn}")
    public ResponseEntity<Publisher> updatePublisher(@PathVariable Long publisherId, @PathVariable int msisdn) {
        return ResponseEntity.ok().body(publisherService.updatePublisher(publisherId, msisdn));
    }

    @DeleteMapping
    @RequestMapping("/delete/{publisherId}")
    public void deletePublisher(@PathVariable Long publisherId) {
        publisherService.deletePublisher(publisherId);
    }
}
