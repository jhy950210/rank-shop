package rank.rankshop.domain;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.*;

@Entity
public class Visit {

    @Id @GeneratedValue
    @Column(name = "visit_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(fetch = LAZY, cascade = ALL)
    @JoinColumn(name = "review_id")
    private Review review;

    @OneToMany(mappedBy = "visit", cascade = ALL)
    private List<VisitShop> visitShopList = new ArrayList<>();

    private LocalDateTime visitDate;
}
