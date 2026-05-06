# vector-trace-incident-grid

`vector-trace-incident-grid` is a Scala project in observability. Its focus is to package a Scala local lab for incident analysis with transition tables, invalid-transition tests, and documented operating limits.

## Why I Keep It Small

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Vector Trace Incident Grid Review Notes

The first comparison I would make is `incident shape` against `latency skew` because it shows where the rule is most opinionated.

## Included Behavior

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/vector-trace-incident-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `incident shape` and `latency skew`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Internal Model

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `span volume`, `latency skew`, `signal loss`, and `incident shape`.

The Scala implementation avoids hidden state so fixture changes are easy to reason about.

## Try It Locally

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Validation

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Scope

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
