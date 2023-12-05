package com.example.patientmvc.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min = 4,max = 20)
    private String nom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datadenaissance;
    private boolean malade;
    @Min(100)
    private int score;

    public String formatDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(datadenaissance);
    }
}
