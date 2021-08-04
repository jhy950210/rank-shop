package rank.rankshop.domain.shop;

import rank.rankshop.domain.Address;
import rank.rankshop.domain.Category;
import rank.rankshop.domain.Visit;
import rank.rankshop.domain.VisitShop;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

public abstract class Shop {

    @Id @GeneratedValue
    @Column(name = "shop_id")
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany(mappedBy = "shop", cascade = ALL)
    private List<VisitShop> visitShopList = new ArrayList<>();

    @Embedded
    private Address address;
}
