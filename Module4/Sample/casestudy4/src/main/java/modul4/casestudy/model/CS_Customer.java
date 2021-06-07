package modul4.casestudy.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;


@Entity
@Data
@Builder

public class CS_Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Integer customer_id;

    @Column(name = "customer_name")
    @NotNull(message = "Name is mandatory")
    private String customer_name;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", nullable = false)
    private Integer customer_type_id;

    @Column(name = "customer_birthday")
    @Past
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private String customer_birthday;

    /*
       ***Chua biet xu ly enum ra sao***
    @Column(name = "customer_gender")
    private  customer_gender;
    */


    @NotBlank(message = "ID_Card is mandatory")
    private String customer_id_card;

    @NotBlank(message = "Customer phone is mandatory")
    @Pattern(regexp = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$",
            message = "Vietnam phone number invalid ")
    private String customer_phone;


    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Email must be valid")
    private String customer_email;

    private String customer_address;


}
