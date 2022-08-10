package com.example.publisherapp.controller;

import com.example.publisherapp.service.interfaces.PublisherService;
import lombok.RequiredArgsConstructor;
import com.example.publisherapp.model.Publisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PublisherController {
    private final PublisherService publisherService;

    @GetMapping
    @RequestMapping("/publisher")
    public ResponseEntity<Publisher> generatePublisher() {
        return ResponseEntity.ok().body(publisherService.getPublisher());
    }
}
