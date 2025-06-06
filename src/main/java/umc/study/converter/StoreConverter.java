package umc.study.converter;

import org.springframework.data.domain.Page;
import umc.study.domain.Region;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.web.dto.StoreRequestDTO;
import umc.study.web.dto.StoreResponseDTO.*;

import java.util.List;
import java.util.stream.Collectors;

public class StoreConverter {

    // DTO → Entity
    public static Store toStore(StoreRequestDTO.JoinStoreDTO dto, Region region) {
        return Store.builder()
                .name(dto.getName())
                .address(dto.getAddress())
                .region(region)
                .score(0.0f)
                .build();
    }

    // Entity → DTO (리뷰 단건)
    public static ReviewPreViewDTO toReviewPreViewDTO(Review review) {
        return ReviewPreViewDTO.builder()
                .ownerNickname(review.getMember().getName())
                .score(review.getScore())
                .createdAt(review.getCreatedAt().toLocalDate())
                .body(review.getBody())
                .build();
    }

    // Entity 리스트 → DTO (리뷰 목록)
    public static ReviewPreViewListDTO toReviewPreViewListDTO(Page<Review> reviewPage) {
        List<ReviewPreViewDTO> dtoList = reviewPage.stream()
                .map(StoreConverter::toReviewPreViewDTO)
                .collect(Collectors.toList());

        return ReviewPreViewListDTO.builder()
                .reviewList(dtoList)
                .listSize(dtoList.size())
                .totalPage(reviewPage.getTotalPages())
                .totalElements(reviewPage.getTotalElements())
                .isFirst(reviewPage.isFirst())
                .isLast(reviewPage.isLast())
                .build();
    }

    // Store → JoinStoreResultDTO
    public static JoinStoreResultDTO toJoinStoreResultDTO(Store store) {
        return JoinStoreResultDTO.builder()
                .id(store.getId())
                .name(store.getName())
                .address(store.getAddress())
                .score(store.getScore())
                .regionName(store.getRegion().getName())
                .build();
    }
}
