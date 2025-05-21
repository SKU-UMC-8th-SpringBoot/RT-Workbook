package umc.study.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


public class MissionRequestDTO {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinMissionDTO{
        @NotNull
        private Integer reward;
        @NotNull
        private LocalDate deadline;
        @NotBlank
        private String missionSpec;
        @NotNull
        private Long storeId;
    }
}
