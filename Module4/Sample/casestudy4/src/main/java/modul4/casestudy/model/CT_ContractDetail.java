package modul4.casestudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CT_ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ct_detail_id;
    @ManyToOne
    @JoinColumn
    private Integer ct_id;
    @ManyToOne
    @JoinColumn
    private Integer attach_service_id;
    private Integer quantity;
}
