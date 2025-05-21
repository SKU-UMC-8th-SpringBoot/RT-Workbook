package umc.study.converter;
import umc.study.domain.Member;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.web.dto.ReviewRequestDTO;

public class ReviewConverter {

    // DTO → Entity
    public static Review toReview(ReviewRequestDTO.JoinReviewDTO joinReviewDTO, Member member, Store store) {
        return Review.builder()
                .title(joinReviewDTO.getTitle())
                .score(Float.valueOf(joinReviewDTO.getScore()))
                .member(member)
                .store(store)
                .build();
    }

}
