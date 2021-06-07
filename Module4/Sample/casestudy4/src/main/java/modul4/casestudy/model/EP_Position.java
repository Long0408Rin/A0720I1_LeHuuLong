package modul4.casestudy.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
public class EP_Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "EP_position")
    private Integer position_id;

    @NotNull(message = "position_name is mandatory")
    private String position_name;
}
