# SmallBlockchain

[![Tests](https://github.com/ebukreev/SmallBlockchain/actions/workflows/gradle-tests.yml/badge.svg?branch=master)](https://github.com/ebukreev/SmallBlockchain/actions/workflows/gradle-tests.yml)

Just a small blockchain for my university network programming course.

## Demonstration

To run the demo:

```bash
docker build -t bukreevdev/node .
docker-compose up
```

## Testing

Implemented test levels:
* End to End tests
* Integration tests
* Unit tests

Tests coverage:

| Class      | Method     | Line         |
|------------|------------|--------------|
| 75%(30/40) | 82%(56/68) | 80%(264/328) |