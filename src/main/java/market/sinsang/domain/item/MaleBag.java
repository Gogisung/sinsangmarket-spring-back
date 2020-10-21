package market.sinsang.domain.item;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("MB")
public class MaleBag extends Item{
    private String shoulder;
    private String crossBack;
    private String backpack;
    private String pouch;
    private String wallet;
    private String sale;
}
