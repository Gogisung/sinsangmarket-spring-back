package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("FC")
public class FemaleClothes extends Item{
    private String outer;
    private String top;
    private String dress;
    private String shirt;
    private String knit;
    private String blueJeans;
    private String pants;
    private String skirt;
    private String setItem;
    private String bigSize;
    private String sale;
    private String season;
    private String maternityDress;


}
