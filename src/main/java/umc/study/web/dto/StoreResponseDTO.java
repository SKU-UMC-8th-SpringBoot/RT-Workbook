package umc.study.web.dto;
import lombok.*;
import umc.study.domain.Review;

import java.time.LocalDate;
import java.util.List;

public class StoreResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinStoreResultDTO{
        private Long id;
        private String name;
        private String address;
        private Float score;
        private String regionName;
    }
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReviewPreViewListDTO {
        List<ReviewPreViewDTO> reviewList;
        Integer listSize;
        Integer totalPage;
        Long totalElements;
        Boolean isFirst;
        Boolean isLast;
    }
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReviewPreViewDTO {
        private String ownerNickname;
        private Float score;
        private String body;
        private LocalDate createdAt;

        // Review 객체를 받아서 초기화하는 생성자 추가
        public ReviewPreViewDTO(Review review) {
            this.score = review.getScore();  // 예시
            this.body = review.getBody();  // 예시
            this.createdAt = LocalDate.from(review.getCreatedAt());  // 예시
        }
    }

}