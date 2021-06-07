package modul4.casestudy.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "customer_type")
public class CS_CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerType_id", nullable = false, updatable = false)
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Integer customerType_id;

    @Column(name = "customerType_name", nullable = false)
    private String customerType_name;

    @JsonBackReference
    private List<CS_Customer> cs_customerList;

    public CS_CustomerType() {
    }
}
