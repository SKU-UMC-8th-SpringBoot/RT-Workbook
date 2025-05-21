package umc.study.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ReviewRequestDTO {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinReviewDTO{
        @NotBlank(message = "제목 필수")
        private String title;

        @NotNull(message = "점수 필수")
        private Float score;

        @NotNull(message = "memberId 필수")
        private Long memberId;

        @NotNull(message = "storeId 필수")
        private Long storeId;


    }
}
