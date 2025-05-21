package umc.study.service.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.study.converter.StoreConverter;
import umc.study.domain.Store;
import umc.study.repository.StoreRepository.StoreRepository;
import umc.study.service.StoreService.StoreCommandService;
import umc.study.web.dto.StoreRequestDTO;

@Service
@RequiredArgsConstructor
public class StoreCommandServiceImpl implements StoreCommandService {

    private final StoreRepository storeRepository;

    @Override
    public Store joinStore(StoreRequestDTO.JoinStoreDTO request) {
        Store store = StoreConverter.toStore(request, null);

        return storeRepository.save(store);
    }
}
