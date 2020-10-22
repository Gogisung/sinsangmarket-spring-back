package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;
import market.sinsang.domain.Category;
import market.sinsang.exception.NotEnoughStockExceprion;

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

    /**
     * stock 증가
     */
    public void addStock(int quantity) {
        this.stockQuantity += quantity;
    }

    /**
     * stock 감소
     */
    public void removeStock(int quantity) {
        int restStock = this.stockQuantity - quantity;
        if(restStock < 0) {
            throw new NotEnoughStockExceprion("need more stock");
        }
        this.stockQuantity = restStock;
    }


}
