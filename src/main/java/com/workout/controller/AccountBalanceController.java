package com.workout.controller;

import com.workout.dto.AccountBalanceDto;
import com.workout.model.Transfer;
import com.workout.repository.AccountBalanceRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import static com.workout.controller.AccountBalanceController.ACCOUNT_BALANCE_CONTROLLER_PATH;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("${base-url}" + ACCOUNT_BALANCE_CONTROLLER_PATH)
public class AccountBalanceController {
    public static final String ACCOUNT_BALANCE_CONTROLLER_PATH = "/balances";
    private final AccountBalanceRepository accountBalanceRepository;

    @GetMapping
    @ResponseStatus(OK)
    public List<Transfer> index() {
        //  return "null";
        return accountBalanceRepository.findAll();
    }
}
