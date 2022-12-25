package com.ticaret.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
