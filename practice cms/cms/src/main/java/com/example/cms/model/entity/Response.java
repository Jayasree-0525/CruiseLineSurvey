package com.example.cms.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Response")
public class Response {

    private String answer;

    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "questionId")
    private Question question;

    @OneToOne
    @MapsId("customerId")
    @JoinColumn(name = "customerId")
    private Customer customer;




}
