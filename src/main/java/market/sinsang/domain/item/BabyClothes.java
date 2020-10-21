package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("BC")
public class BabyClothes extends Item{
    private String outer;
    private String knit;
    private String top;
    private String blueJeans;
    private String dress;
    private String pants;
    private String blouse;
    private String skirt;
    private String sale;
    private String season;
    private String bottomsSet;
    protected String fullDress;

}
