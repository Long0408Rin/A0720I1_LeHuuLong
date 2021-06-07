package modul4.casestudy.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CT_AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Double cost;
    private Integer unit;
    /*
        Cai enum ni lam sau
        private enum status
     */
    @ManyToMany(mappedBy = "attachService")
    @JsonBackReference
    private Set<CT_ContractDetail> contractDetails;

    public CT_AttachService() {
    }
}
