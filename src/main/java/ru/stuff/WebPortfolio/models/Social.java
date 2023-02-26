package ru.stuff.WebPortfolio.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "social")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Social {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @NotEmpty(message = "Укажите название соцсети")
    @Column(name = "name")
    private String name;

//    @NotEmpty(message = "Укажите колличество подписчиков")
    @Column(name = "quantity")
    private int quantity;
}
