package market.sinsang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    private String password;
    private String shopName;

    @Embedded
    private Address address;
    private Long level;
    private Long phone;
    private Long mobilePhone;
    private String status;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
