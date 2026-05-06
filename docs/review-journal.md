# Review Journal

I treated `vector-trace-incident-grid` as a project where the smallest useful behavior should still be inspectable.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 179, lane `ship`
- `stress`: `latency skew`, score 140, lane `ship`
- `edge`: `signal loss`, score 177, lane `ship`
- `recovery`: `incident shape`, score 225, lane `ship`
- `stale`: `span volume`, score 170, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
