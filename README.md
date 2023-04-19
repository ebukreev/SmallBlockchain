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

Implemented test levels of "Testing pyramid":
* [System tests](https://github.com/ebukreev/SmallBlockchain/tree/master/src/test/kotlin/dev/bukreev/smallblockchain/system)
* [Integration tests](https://github.com/ebukreev/SmallBlockchain/tree/master/src/test/kotlin/dev/bukreev/smallblockchain/integration)
* [Unit tests](https://github.com/ebukreev/SmallBlockchain/tree/master/src/test/kotlin/dev/bukreev/smallblockchain/unit)

Non-Functional testing:
* [Load tests](https://github.com/ebukreev/SmallBlockchain/tree/master/src/test/kotlin/dev/bukreev/smallblockchain/load)
* [Stress tests](https://github.com/ebukreev/SmallBlockchain/tree/master/src/test/kotlin/dev/bukreev/smallblockchain/stress)

Tests generation:
* [Fuzzing](https://github.com/ebukreev/SmallBlockchain/tree/master/src/test/kotlin/dev/bukreev/smallblockchain/fuzzing)
 implemented with [cifuzz](https://github.com/CodeIntelligenceTesting/cifuzz) library. To start fuzzing:
```bash
cifuzz -v run dev.bukreev.smallblockchain.fuzzing.FuzzingTests
```
* [Concolic](https://github.com/ebukreev/SmallBlockchain/tree/master/src/test/kotlin/dev/bukreev/smallblockchain/kex) 
 implemented with [kex](https://github.com/vorpal-research/kex).
 Running concolic tests differs from the rest in that they need JUnit4, so you need to create another test session.
* [Property-based](https://github.com/ebukreev/SmallBlockchain/tree/master/src/test/kotlin/dev/bukreev/smallblockchain/pbt)
 implemented with [jqwik](https://github.com/jqwik-team/jqwik).

Tests coverage:

| Class      | Method     | Line         |
|------------|------------|--------------|
| 88%(32/36) | 93%(62/66) | 86%(320/372) |

Mutation testing implemented with [pitest](https://github.com/hcoles/pitest) library.
To run it:
```bash
gradle pitest
```

The project was also scanned by the SAST analyzer [PT Application Inspector](https://plugins.jetbrains.com/plugin/20249-pt-application-inspector).