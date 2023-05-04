package code.neoflex_calculator.controller;

import code.neoflex_calculator.model.OperationModel;
import code.neoflex_calculator.service.impl.OperationsOfSalaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    OperationModel operationModel = new OperationModel();

    @Autowired
    private OperationsOfSalaryServiceImpl operationsOfSalaryServiceImpl;

    @RequestMapping("/calculacte")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }

    @RequestMapping(value="/calculacte", params="calculateSalary", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", operationsOfSalaryServiceImpl.calculateSalary(operationModel));
        return "calculator";
    }
}
