package com.repository;

import com.domain.LeaveTypeVariable;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Repository
public class LeaveRepo {

    private SessionFactory sessionFactory;

    public LeaveRepo(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<LeaveTypeVariable> list() throws SQLException {
        Session session = sessionFactory.getCurrentSession();
        Query<LeaveTypeVariable> studentQuery = session.createQuery("from Student", LeaveTypeVariable.class);
        return studentQuery.getResultList();
    }

    public boolean create(LeaveTypeVariable leaveTypeVariable) throws SQLException {
        Session session = sessionFactory.getCurrentSession();
        session.save(leaveTypeVariable);
        return true;
    }

    public LeaveTypeVariable get(Long id) throws SQLException {
        Session session = sessionFactory.getCurrentSession();
        return session.get(LeaveTypeVariable.class, id);
    }


}
