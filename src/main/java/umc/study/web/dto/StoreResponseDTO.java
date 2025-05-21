package umc.study.web.dto;

import lombok.*;

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
}