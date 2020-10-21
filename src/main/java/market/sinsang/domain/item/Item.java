package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;
import market.sinsang.domain.Category;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus;

    private Long InterestCount;

    @Lob
    private String asf;

    private String color;

    private String size;

    private Boolean sheet;

    @Lob
    private String text;

    private String country;

    private String imgURL;
    private LocalDateTime localDateTime;

    @ManyToMany(mappedBy = "items")
    private List<Category> child = new ArrayList<Category>();


}
