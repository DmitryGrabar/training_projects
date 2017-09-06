package com.epam.grabar.dao.impl;

import com.epam.grabar.dao.IRoomDAO;
import org.hibernate.SessionFactory;

import java.util.List;

public class RoomDAO implements IRoomDAO {

    private static final String SELECT_ALL_ROOMS = "from Room";

    private SessionFactory sessionFactory;


    public List searchRooms(){
        return sessionFactory.getCurrentSession().createQuery(SELECT_ALL_ROOMS).getResultList();
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

