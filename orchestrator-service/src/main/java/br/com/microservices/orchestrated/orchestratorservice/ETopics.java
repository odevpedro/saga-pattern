package br.com.microservices.orchestrated.orchestratorservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ETopics {

    START_SAGA("start_saga"),
    BASE_ORCHESTRATOR("base_orchestrator"),
    FINISH_SUCESS("finish_sucess"),
    FINISH_FAIL("finish_fail"),
    PRODUCT_VALIDATION_SUCESS("product_validation_sucess"),
    PRODUCT_VALIDATION_FAIL("product_validation_fail"),
    PAYMENT_SUCESS("payment_sucess"),
    PAYMENT_FAIL("payment_fail"),
    INVENTORY_SUCESS("inventory_sucess"),
    INVENTORY_FAIL("inventory_fail"),
    NOTIFY_ENDING("notify_ending");

    private String topic;
}
