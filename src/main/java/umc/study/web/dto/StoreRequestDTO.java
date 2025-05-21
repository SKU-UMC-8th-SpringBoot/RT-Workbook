package umc.study.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class StoreRequestDTO {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinStoreDTO{
    @NotBlank(message = "가게 이름은 필수")
    private String name;

    @NotBlank(message = "주소는 필수")
    private String address;

    @NotNull(message = "지역 ID는 필수")
    private Long regionId;


    }
}
