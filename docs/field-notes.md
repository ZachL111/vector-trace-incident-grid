# Field Notes

I would read this project from the data inward: cases first, implementation second.

The domain cases cover `span volume`, `latency skew`, `signal loss`, and `incident shape`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

The widest spread is between `incident shape` and `latency skew`, so those are the first two cases I would preserve during a refactor.

The language-specific addition keeps the review model in case classes and a runner check.
