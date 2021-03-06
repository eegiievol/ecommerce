package gr0102.projectecommercewaa.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    private LocalDateTime orderDate;
    private LocalDateTime cancelledDate;
    private LocalDateTime shippedDate;
    private LocalDateTime deliveredDate;
    private double totalPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private OrdersStatus ordersStatus;
}