package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("BA")
public class BabyAccessory extends Item{
    private String babyShoes;
    private String girlShoes;
    private String boyShoes;
    protected String runningShoe;
    private String flat;
    private String boots;
    private String houseShoes;
    private String slippers;
    private String bag;
    private String etc;
}
