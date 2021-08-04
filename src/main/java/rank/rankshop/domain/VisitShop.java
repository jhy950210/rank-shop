package rank.rankshop.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import rank.rankshop.domain.shop.Shop;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class VisitShop {

    @Id @GeneratedValue
    @Column(name = "visit_shop_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "visit_id")
    private Visit visit;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "shop_id")
    private Shop shop;

}
