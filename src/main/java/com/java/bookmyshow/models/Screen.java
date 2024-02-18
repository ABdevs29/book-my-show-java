package com.java.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "screens")
public class Screen extends BaseModel{
    private String name;

    @OneToMany(mappedBy = "screen")
    private List<Seat> seats;

    @ManyToOne
    private Theatre theatre;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}
