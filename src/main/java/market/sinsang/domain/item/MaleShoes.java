package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("MS")
public class MaleShoes extends Item{
    private String loafer;
    private String runningShoe;
    private String slipper;
    private String shoes;
    private String handmadeShoes;
    private String walker;
    private String sale;
}
