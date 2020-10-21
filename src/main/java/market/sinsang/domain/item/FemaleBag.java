package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter @Setter
@DiscriminatorValue("FB")
public class FemaleBag extends Item{
    private String leather;
    private String shoulderBag;
    private String toteBag;
    private String crossBack;
    private String clutch;
    private String backpack;
    private String etc;
    private String sale;
}
