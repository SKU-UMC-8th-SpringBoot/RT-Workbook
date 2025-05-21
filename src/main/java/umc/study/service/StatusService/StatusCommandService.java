package umc.study.service.StatusService;

import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.StatusRequestDTO;

public interface StatusCommandService {
    MemberMission joinStatus(StatusRequestDTO.JoinStatusDTO request);
}
