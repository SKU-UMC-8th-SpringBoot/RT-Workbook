package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.study.apiPayload.ApiResponse;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.service.ReviewService.ReviewCommandService;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.ReviewResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewRestController {

    private final ReviewCommandService ReviewCommandService;

    @PostMapping("/")
    public ApiResponse<ReviewResponseDTO.JoinReviewResultDTO> join(@RequestBody @Valid ReviewRequestDTO.JoinReviewDTO request) {
        Review review = ReviewCommandService.joinReview(request);
        return ApiResponse.onSuccess(null);
    }

}
