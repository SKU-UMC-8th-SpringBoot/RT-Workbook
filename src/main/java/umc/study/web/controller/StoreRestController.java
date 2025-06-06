package umc.study.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import umc.study.apiPayload.ApiResponse;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.service.StoreService.StoreCommandService;
import umc.study.service.StoreService.StoreQueryService;
import umc.study.web.dto.StoreRequestDTO;
import umc.study.web.dto.StoreResponseDTO;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreRestController {

    private final StoreCommandService storeCommandService;
    private final StoreQueryService storeQueryService;

    @PostMapping("/")
    public ApiResponse<StoreResponseDTO.JoinStoreResultDTO> join(@RequestBody @Valid StoreRequestDTO.JoinStoreDTO request) {
        Store store = storeCommandService.joinStore(request);
        return ApiResponse.onSuccess(null);
    }

    @GetMapping("/{storeId}/reviews")
    public ApiResponse<StoreResponseDTO.ReviewPreViewListDTO> getReviewList(
            @PathVariable Long storeId,
            @RequestParam Integer page) {

        Page<Review> reviewPage = storeQueryService.getReviewList(storeId, page);

        List<StoreResponseDTO.ReviewPreViewDTO> dtoList = reviewPage.stream()
                .map(StoreResponseDTO.ReviewPreViewDTO::new)
                .toList();

        StoreResponseDTO.ReviewPreViewListDTO result = StoreResponseDTO.ReviewPreViewListDTO.builder()
                .reviewList(dtoList)      // 리뷰 목록
                .listSize(reviewPage.getSize())   // 페이지 크기
                .totalPage(reviewPage.getTotalPages())  // 전체 페이지
                .totalElements(reviewPage.getTotalElements())  // 전체 리뷰 수
                .isFirst(reviewPage.isFirst())    // 첫 번째 페이지 여부
                .isLast(reviewPage.isLast())     // 마지막 페이지 여부
                .build();

        return ApiResponse.onSuccess(result);
    }
}
