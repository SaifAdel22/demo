// package com.first.demo;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// @Controller
// public class StaffController {

//     private List<Staff> staffList = new ArrayList<>();
    

//     @GetMapping("/staff")
//     public String showAllStaff(Model model) {
//         model.addAttribute("staffList", staffList);
//         return "staff";
//     }

//     @GetMapping("/addStaff")
//     public String showAddPage(Model model) {
//         model.addAttribute("addNewStaff",new Staff());
//         return "addStaff";
//     }

//     @PostMapping("/addStaff")
//     public String saveStaff(Staff staff) {


//     staffList.add(staff);

//         int newIndex = staffList.size() - 1;     
//         return "redirect:/getStaff?index=" + newIndex;
//     }

//     @GetMapping("/getStaff")
//     public String showOneStaff(@RequestParam int index, Model model) {

//         if (index < 0 || index >= staffList.size()) {
//             return "redirect:/staff";            
//         }

//         model.addAttribute("staff", staffList.get(index));
//         return "getStaff";
//     }
// }