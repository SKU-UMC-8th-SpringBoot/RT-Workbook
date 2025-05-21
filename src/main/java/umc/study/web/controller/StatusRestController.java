package umc.study.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.study.apiPayload.ApiResponse;
import umc.study.domain.mapping.MemberMission;
import umc.study.service.StatusService.StatusCommandService;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.ReviewResponseDTO;
import umc.study.web.dto.StatusRequestDTO;
import umc.study.web.dto.StatusResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/status")
public class StatusRestController {

    private final StatusCommandService StatusCommandService;

    @PostMapping("/")
    public ApiResponse<StatusResponseDTO.JoinStatusResultDTO> join(@RequestBody @Valid StatusRequestDTO.JoinStatusDTO request) {
        MemberMission memberMission = StatusCommandService.joinStatus(request);
        return ApiResponse.onSuccess(null);
    }

}
