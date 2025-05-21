package umc.study.web.dto;

import lombok.*;

public class ReviewResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinReviewResultDTO{
        private Long id;
        private String title;
        private Float score;
        private Long memberId;
        private Long storeId;

    }
}