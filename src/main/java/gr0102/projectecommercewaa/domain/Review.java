package gr0102.projectecommercewaa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String comment;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ReviewStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "rate")
    private ProductRate rate;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}