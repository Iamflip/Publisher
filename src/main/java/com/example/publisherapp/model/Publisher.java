package com.example.publisherapp.model;

import com.example.publisherapp.enums.Action;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Publisher {
    private Integer msisdn;
    private Action action;
    private Long timestamp;
}
