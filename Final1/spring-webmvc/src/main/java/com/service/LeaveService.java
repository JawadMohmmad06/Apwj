package com.service;

import com.domain.LeaveTypeVariable;
import com.repository.LeaveRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
@Transactional
public class LeaveService {

    private LeaveRepo leaveRepo;

    public LeaveService(LeaveRepo leaveRepo) {
        this.leaveRepo = leaveRepo;
    }

    @Transactional
    public boolean insert(LeaveTypeVariable leaveTypeVariable) throws SQLException {

        return leaveRepo.create(leaveTypeVariable);
    }
}
