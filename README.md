# Spring AI Demo Application

This is a Spring Boot application demonstrating AI-powered text generation using OpenAI-compatible APIs via Spring AI.

## Features
- REST endpoint to generate a cat-themed haiku using AI
- Environment variable management via `.env` and Spring configuration

## Project Structure
- `config/` - Configuration classes
- `controller/` - REST controllers
- `service/` - Service interfaces and implementations

## Getting Started

1. **Clone the repository**
2. **Set up your `.env` file** (see `.env.example`)
3. **Build and run**:
   ```sh
   mvn clean spring-boot:run
   ```
4. **Access the endpoint**:
   - `GET /ai/cathaiku`

## Configuration
- Edit `src/main/resources/application.yml` for model and API settings.
- Place your OpenAI-compatible API key in `.env` as `OPENAI_API_KEY`.

## Requirements
- Java 21+
- Maven 3.8+

## License
MIT
