package com.example.publisherapp.model;

import com.example.publisherapp.enums.Action;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "publisher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer msisdn;
    private Action action;
    private Long timestamp;
}
