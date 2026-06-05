package org.scoula.travel.dao;

import org.scoula.travel.database.MyBatisConfig;
import org.scoula.travel.domain.TravelVO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TravelDaoImpl implements TravelDao{
    static final String NAMESPACE = "org.scoula.travel.dao.TravelDao.";

    @Override
    public int getTotalCount() {
        return MyBatisConfig.getSqlSession().selectOne(NAMESPACE+"getTotalCount");
    }

    @Override
    public List<TravelVO> getTravels(int page, int size) {
        int start = (page - 1)*size;
        Map map = Map.of("start", start, "size", size);
        return MyBatisConfig.getSqlSession().selectList(NAMESPACE+"getTravels", map);
    }

    @Override
    public List<String> getDistricts() {
        return List.of();
    }

    @Override
    public List<TravelVO> getTravelsByDistrict(String district) {
        return List.of();
    }

    @Override
    public Optional<TravelVO> getTravel(Long no) {
        return Optional.empty();
    }

    @Override
    public void insert(TravelVO travel) {

    }

    @Override
    public void update(TravelVO travel) {

    }

    @Override
    public void remove(Long no) {

    }
}
