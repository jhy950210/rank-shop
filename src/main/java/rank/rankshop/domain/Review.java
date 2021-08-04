package rank.rankshop.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
public class Review {

    @Id @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    @OneToOne(mappedBy = "review" , fetch = LAZY)
    private Visit visit;

    @Enumerated(EnumType.STRING)
    private ReviewStatus reviewStatus;
}
