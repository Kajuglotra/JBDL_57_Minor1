package org.gfg.minor1.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 30)
    private String name;
    private int cost;
    @ManyToOne
    @JoinColumn
    private Author author;

    private String bookNo; // just to keep a track which student took which book
    @Enumerated(value = EnumType.STRING)
    private BookType type; // 1000
    @JoinColumn
    @ManyToOne
    private Student student;

    //composite key


}
