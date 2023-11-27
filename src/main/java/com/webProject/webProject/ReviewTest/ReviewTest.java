package com.webProject.webProject.ReviewTest;

import com.webProject.webProject.Store.Store;
import com.webProject.webProject.User.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class ReviewTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content; //리뷰내용

    private double rating; //별점

    @ManyToOne
    private Store store; //음식점 이름

    @ManyToOne
    private User author; //작성자

    private LocalDateTime createDate;
}
