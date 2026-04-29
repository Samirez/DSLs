# Domain Specific Languages (DSLs)

A collection of domain-specific languages developed using **Xtext**, a powerful framework for building custom programming languages with minimal effort.

## Overview

This repository contains multiple DSL implementations including:

- **MDSD Assignment 2 & 3**: Educational DSLs for model-driven software development assignments
- **Interactive Fiction**: A DSL for creating text-based interactive fiction games
- **UI Language**: A DSL for defining user interface specifications

Each DSL implementation includes:
- Core language definition and grammar
- IDE support with editor plugins
- Comprehensive test suites
- UI testing capabilities

## Project Structure

```
├── com.mdsd.assignment2/          # Assignment 2 DSL core
│   ├── com.mdsd.assignment2.ide/  # IDE plugin
│   ├── com.mdsd.assignment2.ui/   # UI components
│   ├── com.mdsd.assignment2.tests/ # Language tests
│   └── com.mdsd.assignment2.ui.tests/ # UI tests
│
├── com.mdsd.assignment3/          # Assignment 3 DSL core
│   ├── com.mdsd.assignment3.ide/  # IDE plugin
│   ├── com.mdsd.assignment3.ui/   # UI components
│   ├── com.mdsd.assignment3.tests/ # Language tests
│   └── com.mdsd.assignment3.ui.tests/ # UI tests
│
├── interactive.fiction/           # Interactive Fiction DSL core
│   ├── interactive.fiction.ide/   # IDE plugin
│   ├── interactive.fiction.ui/    # UI components
│   ├── interactive.fiction.tests/ # Language tests
│   └── interactive.fiction.ui.tests/ # UI tests
│
└── ui.language/                   # UI Definition Language core
    ├── ui.language.ide/           # IDE plugin
    ├── ui.language.ui/            # UI components
    ├── ui.language.tests/         # Language tests
    └── ui.language.ui.tests/      # UI tests
```

## Technologies

- **Xtext**: Language development framework
- **Eclipse IDE**: Base platform for IDE plugins
- **EMF (Eclipse Modeling Framework)**: Model infrastructure
- **JUnit**: Testing framework

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Eclipse IDE with Xtext development tools
- Maven (for building)

### Building

Each DSL module can be built independently or as part of the complete project.

## Contributing

Contributions are welcome! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

## Code of Conduct

This project adheres to a [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you are expected to uphold this code.

## Security

For security issues, please see [SECURITY.md](SECURITY.md) for responsible disclosure guidelines.

## License

This project is licensed under the Apache License 2.0. See [LICENSE](LICENSE) file for details.

## Authors

- Samirez

---

For more information about Xtext, visit: https://www.eclipse.org/Xtext/
