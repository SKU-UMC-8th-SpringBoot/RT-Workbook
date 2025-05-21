package umc.study.service.StatusService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.study.converter.ReviewConverter;
import umc.study.converter.StatusConverter;
import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.domain.mapping.MemberMission;
import umc.study.repository.MemberRepository;
import umc.study.repository.MissionRepository;
import umc.study.repository.ReviewRepository;
import umc.study.repository.StatusRepository;
import umc.study.repository.StoreRepository.StoreRepository;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.StatusRequestDTO;

@Service
@RequiredArgsConstructor
public class StatusCommandServiceImpl implements StatusCommandService {

    private final StatusRepository statusRepository;
    private final MemberRepository memberRepository;
    private final MissionRepository missionRepository;

    @Override
    public MemberMission joinStatus(StatusRequestDTO.JoinStatusDTO request) {
        Member member = memberRepository.findById(request.getMemberId())
                .orElseThrow(() -> new RuntimeException("Member not found"));

        Mission mission = missionRepository.findById(request.getMissionId())
                .orElseThrow(() -> new RuntimeException("Mission not found"));

        MemberMission memberMission = StatusConverter.memberMission(request, member, mission);
        return statusRepository.save(memberMission);
    }

}
