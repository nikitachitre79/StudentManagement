# Engineering Standards

## Architecture

### Layered Architecture

- Controllers must never access repositories directly.
- Controllers must only orchestrate requests and responses.
- Business logic must reside in Services, Handlers, or Domain classes.
- Data access must be isolated within Repository or Data Access layers.
- UI, API, Domain, and Data layers must remain independent.

### Dependency Management

- Use dependency injection for all external dependencies.
- Avoid static classes for business logic.
- Avoid service locator patterns.
- Invert dependencies using interfaces.
- Dependencies must point inward toward the domain layer.

### Clean Code Principles

- Methods should have a single responsibility.
- Classes should have a single responsibility.
- Functions exceeding 50 lines require justification.
- Avoid duplicate logic.
- Favor composition over inheritance.
- Follow SOLID principles.

### Error Handling

- Do not swallow exceptions.
- Log all unexpected exceptions.
- Return meaningful error responses.
- Avoid generic catch blocks.
- Implement centralized exception handling.

---

## Security

### Secrets Management

- Hardcoded secrets are strictly prohibited.
- API keys, passwords, and connection strings must be stored in Azure Key Vault.
- Secrets must never appear in source control.
- Secrets must never be logged.

### Authentication & Authorization

- Every API endpoint must enforce authorization unless explicitly documented.
- Role-based authorization must be used where appropriate.
- Sensitive operations require elevated permissions.
- Validate user identity before accessing sensitive data.

### Input Validation

- Validate all user input.
- Use FluentValidation for request validation.
- Reject invalid requests with clear messages.
- Sanitize external input before processing.

### Secure Coding

- Protect against SQL Injection.
- Protect against Cross-Site Scripting (XSS).
- Protect against CSRF attacks.
- Avoid dynamic SQL.
- Use parameterized queries.
- Encrypt sensitive data at rest and in transit.

### Logging & Monitoring

- Do not log passwords, tokens, or PII.
- Security-relevant actions must be audited.
- Failed authentication attempts must be logged.
- Log entries must contain sufficient context for investigation.

---

## Testing

### Unit Testing

- New functionality must include unit tests.
- Critical business logic requires comprehensive test coverage.
- Positive and negative test cases are required.
- Edge cases must be validated.

### Integration Testing

- API endpoints must include integration tests.
- Database interactions must be tested.
- External service integrations must be verified.

### Coverage Standards

- Minimum code coverage: 80%.
- Mission-critical services must maintain 90% coverage.
- New code should not reduce repository coverage.

### Test Quality

- Tests must be deterministic.
- Avoid flaky tests.
- Mock only external dependencies.
- Test behavior, not implementation details.

---

## Performance

### Resource Utilization

- Avoid unnecessary database queries.
- Prevent N+1 query issues.
- Minimize network calls.
- Cache frequently accessed data where applicable.

### Scalability

- Design APIs to be stateless.
- Use pagination for large datasets.
- Use asynchronous operations for I/O-bound work.
- Avoid blocking operations in request pipelines.

### Performance Review

- Identify expensive loops.
- Review memory allocations.
- Avoid redundant processing.
- Evaluate algorithm complexity.

---

## APIs

### Design Standards

- Follow REST conventions.
- Use nouns instead of verbs in routes.
- Version public APIs.
- Ensure APIs are backward compatible.

### Request Validation

- Use FluentValidation.
- Validate request models before processing.
- Reject malformed requests.

### Responses

- Return typed response contracts.
- Use consistent error formats.
- Avoid returning internal exception details.
- Include appropriate HTTP status codes.

### Documentation

- All endpoints require OpenAPI/Swagger documentation.
- Document request and response models.
- Provide examples for complex operations.

---

## Maintainability

### Naming Conventions

- Class names must be descriptive.
- Method names must clearly express intent.
- Avoid abbreviations unless universally understood.
- Use consistent naming standards across solutions.

### Readability

- Favor self-documenting code.
- Keep methods small and focused.
- Reduce nesting where possible.
- Remove dead code.

### Technical Debt

- New code must not introduce technical debt.
- Existing technical debt should be reduced when practical.
- Refactoring opportunities should be identified during review.

---

## Review Rubric

Review all code changes and classify findings using:

### Critical
- Security vulnerabilities
- Data exposure risks
- Authentication failures
- Production outage risks

### High
- Architecture violations
- Significant performance concerns
- Missing validation
- Missing test coverage

### Medium
- Maintainability concerns
- Code smells
- Readability issues

### Low
- Style recommendations
- Minor optimizations

---

## Final Recommendation

Provide one of the following:

- APPROVE
- APPROVE WITH COMMENTS
- REQUEST CHANGES

Every recommendation must include supporting evidence.


