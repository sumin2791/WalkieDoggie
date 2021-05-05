package com.ssafy.pet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

import com.ssafy.pet.dao.PlaceDao;
import com.ssafy.pet.dto.LikePlaceDto;

@Service
public class PlaceServiceImpl implements PlaceService{

    @Autowired
	PlaceDao pdao;

	@Override
    public Integer checkPlace(Map<String, Object> param) {
        return pdao.checkPlace(param);
    }

    @Override
    public int createPlace(Map<String, Object> param) {
        return pdao.createPlace(param);
    }

    @Override
    public int clickPlace(Map<String, Object> param) {
        return pdao.clickPlace(param);
    }

    @Override
    public int plusPlace(int pid) {
        return pdao.plusPlace(pid);
    }

    @Override
    public int checkLike(Map<String, Object> map) {
        return pdao.checkLike(map);
    }

    @Override
    public int isWriter(Map<String, Object> map) {
        return pdao.isWriter(map);
    }

    @Override
    public int modifyPlace(LikePlaceDto likePlaceDto) {
        return pdao.modifyPlace(likePlaceDto);
    }

    @Override
    public int deletePlace(int lid) {
        return pdao.deletePlace(lid);
    }

    @Override
    public int minusPlace(int pid) {
        return pdao.minusPlace(pid);
    }

    @Override
    public Integer checkLikePost(Map<String, Object> param) {
        return pdao.checkLikePost(param);
    }

    @Override
    public int clickLike(Map<String, Object> param) {
        return pdao.clickLike(param);
    }

    @Override
    public int clickUnlike(Map<String, Object> param) {
        return pdao.clickUnlike(param);
    }

    @Override
    public void plusPost(int lid) {
        pdao.plusPost(lid);
    }

    @Override
    public void minusPost(int lid) {
        pdao.minusPost(lid);
    }

}
