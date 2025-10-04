package com.omeracar.dto;

import jakarta.persistence.Id;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudent {

    private Integer id;

    private String firstName;

    private String lastName;

    private List<DtoCourse> courses=new ArrayList<>();
}
