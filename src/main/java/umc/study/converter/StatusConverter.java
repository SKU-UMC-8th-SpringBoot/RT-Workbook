package umc.study.converter;
import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.Review;
import umc.study.domain.Store;
import umc.study.domain.enums.MissionStatus;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.StatusRequestDTO;

public class StatusConverter {

    // DTO → Entity
    public static MemberMission memberMission(StatusRequestDTO.JoinStatusDTO joinStatusDTO, Member member, Mission mission) {

     MissionStatus missionStatus = null;

     if (true) {
         missionStatus  = MissionStatus.COMPLETE;
     }
     else {
         missionStatus  = MissionStatus.CHALLENGING;
     }

        return MemberMission.builder()
                .status(missionStatus)
                .member(member)
                .mission(mission)
                .build();
    }

}
