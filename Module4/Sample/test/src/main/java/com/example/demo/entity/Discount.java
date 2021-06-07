package com.example.demo.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


@Entity
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Size(min = 5, max = 50, message = "Not character number")
    private String Title;

    @Past
    @DateTimeFormat
    @NotNull
    @Past
    @NotBlank(message = "Time Start is mandatory")
    private String TimeStart;


    @NotNull
    @DateTimeFormat
    @Past
    @NotBlank(message = "Time Finish is mandatory")
    private String TimeFinish;

    @NotNull
    @NotBlank(message = "Value decrease is mandatory")
    @Min(value = 10001, message = "Decrease Value must be over 10000 VND ")
    private Double DecreaseValue;


    @Size(min = 5, max = 50)
    @NotBlank(message = "Discount Detail is mandatory")
    private String Detail;

    public Discount() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTimeStart() {
        return TimeStart;
    }

    public void setTimeStart(String timeStart) {
        TimeStart = timeStart;
    }

    public String getTimeFinish() {
        return TimeFinish;
    }

    public void setTimeFinish(String timeFinish) {
        TimeFinish = timeFinish;
    }

    public Double getDecreaseValue() {
        return DecreaseValue;
    }

    public void setDecreaseValue(Double decreaseValue) {
        DecreaseValue = decreaseValue;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }
}
