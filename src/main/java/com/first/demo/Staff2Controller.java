package com.first.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class Staff2Controller {

    private List<Staff> staffList = new ArrayList<>();
    //private List<Staff> staffList2 = new ArrayList<>();


    @GetMapping("/staff2")
    public String showAllStaff2(Model model) {
        model.addAttribute("staff", staffList);
        return "staff";
    }

    @GetMapping("/addStaff2")
    public String showAddPage2(Model model, @RequestParam(required = false) String staffId) {
        Staff myStaff = new Staff();
        int index = getStaffIndex(staffId);
        
        model.addAttribute("addNewStaff", index == Constant.NO_MATCh ? myStaff : staffList.get(index));
        return "addStaff";
    }

    public int getStaffIndex(String staffId) {
        for (int i =0 ; i< staffList.size() ; i ++)
            if(staffList.get(i).getStaffId().equals(staffId)) return i;
            return Constant.NO_MATCh;
        }
        
       
    

   @PostMapping("/addStaff2")
    public String saveStaff2(@Valid @ModelAttribute("addNewStaff") Staff staff, BindingResult result ) {
        System.out.println(result.hasErrors());
        
        if (result.hasErrors() == true) {
            // يجب تمرير الـ model وإضافة الـ staff ليظهر في الصفحة بنفس البيانات ورسائل الخطأ
           // model.addAttribute("addNewStaff", staff); 
            return "addStaff";
        }

        int index = getStaffIndex(staff.getStaffId());
        
        int targetIndex;
        if (index == Constant.NO_MATCh) {
            staffList.add(staff);
            targetIndex = staffList.size() - 1;
        } else {
            staffList.set(index, staff);
            targetIndex = index; 
        }

        return "redirect:/getStaff2?index=" + targetIndex;
    }

    @GetMapping("/getStaff2")
    public String showOneStaff2(@RequestParam int index, Model model) {
        if (index < 0 || index >= staffList.size()) {
            return "redirect:/staff2";            
        }

        model.addAttribute("staff", staffList.get(index));
        return "getStaff";
    }
    @GetMapping("/deleteStaff2")
    public String deleteStaff2(@RequestParam String staffId) {
        int index = getStaffIndex(staffId);
        
        if (index != Constant.NO_MATCh) {
            staffList.remove(index);
        }
        
        return "redirect:/staff2";
    }
}