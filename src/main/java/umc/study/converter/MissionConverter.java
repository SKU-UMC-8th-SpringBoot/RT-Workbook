package umc.study.converter;
import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.web.dto.MissionRequestDTO;
import umc.study.web.dto.ReviewRequestDTO;

public class MissionConverter {

    // DTO → Entity
    public static Mission toMission(MissionRequestDTO.JoinMissionDTO joinMissionDTO, Store store) {
        return Mission.builder()
                .reward(joinMissionDTO.getReward())
                .deadline(joinMissionDTO.getDeadline())
                .missionSpec(joinMissionDTO.getMissionSpec())
                .store(store)
                .build();
    }

}
