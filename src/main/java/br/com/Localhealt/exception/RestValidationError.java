package br.com.Localhealt.exception;

public record RestValidationError(String field, String message) {}
