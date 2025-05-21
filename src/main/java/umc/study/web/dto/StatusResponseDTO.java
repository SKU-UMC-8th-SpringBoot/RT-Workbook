package umc.study.web.dto;

import lombok.*;

public class StatusResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinStatusResultDTO{
        private int status;
        private Long memberId;
        private Long missionId;

    }
}