package br.com.payrollapi.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.payrollapi.domain.Payroll;
import br.com.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource{

    private final PayrollService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long id, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(service.getPayment(id, payment));
    }
}
