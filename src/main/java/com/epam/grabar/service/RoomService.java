package com.epam.grabar.service;

import com.epam.grabar.dao.impl.RoomDAO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class RoomService {

    private RoomDAO dao;

    public List searchRooms() {
        return dao.searchRooms();
    }

    public void setDao(RoomDAO dao) {
        this.dao = dao;
    }

    public RoomDAO getDao() {
        return dao;
    }
}