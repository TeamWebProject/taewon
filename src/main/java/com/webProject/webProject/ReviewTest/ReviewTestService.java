package com.webProject.webProject.ReviewTest;

import com.webProject.webProject.Review.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public void addReview(ReviewTest review) {
        // 리뷰 저장 로직 구현
        reviewRepository.save(review);
    }
}