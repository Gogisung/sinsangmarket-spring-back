package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("FS")
public class FemaleShose extends Item {
    private String flat;
    private String heel;
    private String wedgeHeel;
    private String sandal;
    private String sneakers;
    private String walker;
    private String handmadeShoes;
}
