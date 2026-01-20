# Clean Architecture Folder Structure Documentation

This document outlines the comprehensive folder structure of a Clean Architecture implementation within the `android-clean-architecture-sample` repository.

## Core Layer
- **BaseActivity**: A base class for activities in the application that provides common functionality.
- **BaseFragment**: A base class for fragments with shared behaviors and properties.
- **BaseState**: Represents the state of a UI component, capturing various states (loading, success, error).
- **BaseRequest**: A base class for all API request models.
- **BaseResponse**: A base class for all API response models.
- **BaseViewModel**: A base class for ViewModels, containing shared functionality for managing UI-related data.
- **BaseRepository**: Abstract class that defines the contract for repository implementations.
- **BaseUseCase**: Abstract class that defines the structure of use cases.

## Multi-Feature Modular Structure
```
app/
   ├── featureA/
   │   ├── data/
   │   ├── domain/
   │   └── presentation/
   ├── featureB/
   │   ├── data/
   │   ├── domain/
   │   └── presentation/
   └── common/  // Common modules/elements
```

## Utils and Helpers
- A package containing utility classes and extensions that can be reused across the codebase.

## Mappers and Converters
- Classes responsible for converting data between different representations (e.g., DTOs to domain models).

## Network Layer
- **Interceptors**: Classes for intercepting network requests and responses for purposes like logging or adding headers.
- **API Services**: Interfaces defining API endpoints.
- **DTOs**: Data Transfer Objects representing the data structure returned by the API.

## Data Sources
- **Remote**: Classes for retrieving data from remote sources (e.g., network, API).
- **Local**: Classes for managing local data storage (e.g., Room, SharedPreferences).

## Domain Layer
- **Models**: Representation of the business logic entities.
- **Use Cases**: Classes that encapsulate business rules and operations performed on the data.
- **Repository Interfaces**: Contracts for data access methods.

## Data Layer
- **Repositories**: Implementations of the repository interfaces that handle data operations.
- **Entities**: Database entities representing data models.

## Presentation Layer
- **UI**: Activities, Fragments, and Composables representing the UI.
- **ViewModels**: Classes that handle the presentation logic.
- **States**: Classes that represent various UI states.

## Services
- **FCM**: Classes for handling Firebase Cloud Messaging.
- **Location**: Classes for obtaining location data.
- **Download**: Services related to downloading data/files.
- **Media**: Services for handling media operations.

## Payment Gateway Integration
- Implementations for integrating online payment solutions.

## Maps Integration
- Implementations for integrating mapping services (Google Maps, etc.).

## Native Layer Communication (JNI)
- Classes that define communication between Kotlin/Java and native code.

## Singletons and Builder Factories
- Implementations for lifecycle management of certain classes (e.g., services, repositories).

## Dependency Injection Modules
- Configuration for dependency injection (e.g., Dagger, Hilt) that defines how to provide instances of classes throughout the app.

## Local Database with Room
- **DAOs**: Data Access Objects that define methods for accessing the database.
- **Entities**: Data models that are stored in the database.
- **Converters**: Classes that convert complex types into storable types.

## Preferences Management
- Implementation for managing user preferences, including encryption for sensitive data.

## Media Players and Viewers
- Classes for playing/displaying media (images, PDFs, videos, audios).

## Analytics Integration
- Implementation for integrating analytics libraries for tracking user interactions and events.

## JWT Authentication
- Implementation for managing JSON Web Token based authentication.

## Testing Structure
- Directory containing the tests for various components (unit, integration, UI tests) following best practices.

---

This file serves as a guide for understanding the architecture and organization of the project. For each layer and component, further documentation may be needed to elaborate on specifics regarding implementation and usage.