package umc.study.converter;

import umc.study.domain.Region;
import umc.study.domain.Store;
import umc.study.web.dto.StoreRequestDTO;

public class StoreConverter {

    // DTO → Entity
    public static Store toStore(StoreRequestDTO.JoinStoreDTO joinStoreDTO, Region region) {
        return Store.builder()
                .name(joinStoreDTO.getName())
                .address(joinStoreDTO.getAddress())
                .region(region)
                .score(0.0f)
                .build();
    }

}
