package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("FA")
public class FemaleAccessory extends Item{
    private String jewelry;
    private String belt;
    private String hairPin;
    private String cap;
    private String glasses;
    private String watch;
    private String etc;
}
