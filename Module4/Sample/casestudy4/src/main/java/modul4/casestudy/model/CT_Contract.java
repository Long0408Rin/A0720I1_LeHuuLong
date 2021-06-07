package modul4.casestudy.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CT_Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String ct_start_date;
    private String ct_end_date;
    private Double ct_deposit;
    private Double ct_total_money;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private EP_Employee ep_employee;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CS_Customer cs_customer;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private SV_Service sv_service;


}
