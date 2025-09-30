package com.omeracar.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {

    @NotEmpty(message = "Firstname alanı boş bırakılamaz!")
    @Size(min = 3, max = 10, message = "firstname 3-10 karakter olmalı")
    private String firstName;

    @Size(min = 3,max = 30,message = "lastname min 3 max 30 karakter olmalı")
    private String lastName;

    private Date birthOfDate;

    @Email(message = "Geçerli bir e-posta adresi giriniz")
    private String email;

    @Size(min = 11,max = 11, message = "tckn boş geçilemez")
    @NotEmpty(message = "tckn boş geçilemez")
    private String tckn;


}
