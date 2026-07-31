# Engineering Standards

## Architecture

- Controllers must never access repositories directly.
- Business logic belongs in services.
- Use dependency injection.

## Security

- No hardcoded secrets.
- Use Key Vault for secrets.
- Validate all external inputs.

## Testing

- New features require unit tests.
- Minimum 80% coverage.

## APIs

- Use FluentValidation.
- Return typed responses.
- Follow REST naming conventions.
``
