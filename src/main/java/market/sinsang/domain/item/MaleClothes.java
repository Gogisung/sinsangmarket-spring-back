package market.sinsang.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("MC")
public class MaleClothes extends Item {
    private String outer;
    private String top;
    private String shirt;
    private String knit;
    private String suit;
    private String blueJean;
    private String pants;
    private String sale;
    private String season;
}
