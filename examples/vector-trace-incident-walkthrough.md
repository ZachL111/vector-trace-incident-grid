# Vector Trace Incident Grid Walkthrough

The fixture is intentionally compact, so the review starts with the cases that pull farthest apart.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 179 | ship |
| stress | latency skew | 140 | ship |
| edge | signal loss | 177 | ship |
| recovery | incident shape | 225 | ship |
| stale | span volume | 170 | ship |

Start with `recovery` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `stress` becomes less cautious without a clear reason, I would inspect the drag input first.
