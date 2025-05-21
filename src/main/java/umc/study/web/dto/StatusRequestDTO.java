package umc.study.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class StatusRequestDTO {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinStatusDTO{


        @NotNull
        private int status;

        @NotNull(message = "memberId 필수")
        private Long memberId;

        @NotNull(message = "missionId 필수")
        private Long missionId;


    }
}
