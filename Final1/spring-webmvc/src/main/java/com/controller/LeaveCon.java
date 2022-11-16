package com.controller;

import com.domain.LeaveTypeVariable;
import com.repository.LeaveRepo;
import com.service.LeaveService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.SQLException;

@Controller
@RequestMapping("/leave")
public class LeaveCon {

    private LeaveService leaveService;

    public LeaveCon(LeaveService leaveService) {
        this.leaveService = leaveService;
    }



    @RequestMapping("/l")
    public void show(Model model) throws SQLException  {
        LeaveTypeVariable leaveTypeVariable = new LeaveTypeVariable();
        leaveService.insert(leaveTypeVariable);
        System.out.println("ok");
    }


}
