package com.swacademy.cnuworldcup.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Menu {
    @Id
    private UUID menu_id;

    @Column(length = 20, nullable = false, unique = false)
    private UUID store_id;

    @Column(length = 20, nullable = false, unique = false)
    private String store_name;

    @Column(length = 20, nullable = false, unique = false)
    private String image;

    @Column(length = 20, nullable = false, unique = false)
    private int price;
}