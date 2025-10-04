package com.omeracar.dto;

import com.omeracar.entities.Department;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoEmployee {

    private Long id;

    private String name;

    @ManyToOne
    private DtoDepartment department;
}
