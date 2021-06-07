package modul4.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class EP_Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Name is mandatory")
    private String name;


    @ManyToOne
    private EP_Position ep_position;

}
