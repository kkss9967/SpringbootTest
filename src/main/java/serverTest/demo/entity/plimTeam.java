package serverTest.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class plimTeam {

    @Id
    private int id;

    private String name;
    private String role;
}
