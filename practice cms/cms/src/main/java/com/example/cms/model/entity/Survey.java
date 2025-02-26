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
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Survey")
public class Survey {

    @OneToOne
    @MapsId("customerId")
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToOne
    @MapsId("cruiseId")
    @JoinColumn(name = "cruiseId")
    private CruiseLine cruiseLine;


    @OneToMany(mappedBy = "Question")
    private List<Question> listOfQuestions = new ArrayList<>();
}
