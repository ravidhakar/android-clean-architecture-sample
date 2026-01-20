# Android Clean Architecture Folder Structure

This document provides a comprehensive overview of the folder structure used in the Android Clean Architecture project, explaining the responsibilities and contents of each layer.

## 1. Core Layer
   - **Base Classes**: Contains base classes for common functionality across the project.
   - **DI Modules**: Dependency Injection modules for setting up dependencies (e.g., using Hilt or Dagger).

## 2. Network Layer
   - **Interceptors**: Classes that intercept network calls for logging, adding headers, or managing token refresh.

## 3. Database Layer
   - **Room DAOs**: Data Access Objects for interacting with the Room database.
   - **Entities**: Data models that represent the tables in the database.
   - **Preferences & DataStore**: Management of user preferences and data storage using Jetpack DataStore.

## 4. Util and Helper Classes
   - **Extensions**: Kotlin extensions to enhance functionality.
   - **Managers**: Classes responsible for managing specific tasks (e.g., LocationManager, NotificationManager).
   - **Singletons**: Classes intended to have a single instance throughout the app.
   - **Factories & Builders**: Classes for creating instances of objects in a controlled manner.
   - **Mappers**: Classes for converting data from one format to another.
   - **Analytics**: Integration interfaces for analytics services.
   - **Players & Viewers**: Classes responsible for handling media playback and viewing content.
   - **Native JNI Layer**: C/C++ code used to perform tasks requiring native performance boosts.

## 5. Data Layer
   - **Remote Data Sources**: Interfaces and implementations for accessing remote data (API calls).
   - **Local Data Sources**: Interfaces and implementations for accessing local data (Room).
   - **Repositories**: Abstraction layer that combines both local and remote data sources, providing data to be used in the domain layer.
   - **DTOs**: Data Transfer Objects used for sending data over the network.

## 6. Domain Layer
   - **Models**: Plain Old Kotlin Objects (POKOs) representing data structure.
   - **Repository Interfaces**: Interfaces for repositories, defining the contract the data layer follows.
   - **Use Cases**: Classes for encapsulating specific application use cases for Auth, User, Product, Order, Payment, and Map.

## 7. Presentation Layer
   - **UI Screens**: Composable functions or XML layouts representing screens (e.g., Splash, Auth, Main, Home, Profile, Products, Cart, Checkout, Payment, Orders, Favorites, Map, Notifications, Settings).
   - **Adapters**: Classes that facilitate data binding between UI components and data models.
   - **Navigation**: Management of navigation between the app's screens.

## 8. Services Layer
   - **FCM Services**: Classes responsible for Firebase Cloud Messaging services.
   - **Location Services**: Classes to manage location-related tasks.
   - **Download/Upload Services**: Classes handling file transfers.
   - **Sync Services**: Classes responsible for data synchronization.
   - **Media Services**: Classes managing media tasks.

## 9. Workers & Receivers
   - **WorkManager Workers**: Classes for background tasks using WorkManager.
   - **Broadcast Receivers**: Classes handling system broadcast events.

## 10. Complete Testing Structure
   - **Unit Tests**: Classes for testing individual units of the codebase.
   - **UI Tests**: Classes for testing user interface components.
   - **Integration Tests**: Classes for testing the integration between components.

## Tech Stack & Design Patterns
   - **Kotlin**: Programming language used.
   - **Jetpack Components**: Utilized for lifecycle management and UI components.
   - **Clean Architecture**: Design pattern ensuring separation of concerns throughout the app.
   - **MVVM (Model-View-ViewModel)**: Architectural pattern used for handling UI-related data in a lifecycle-conscious way.
   - **Retrofit**: Used for network operations.
   - **Room**: Database library for local data persistence.

This structure provides a modular, scalable, and maintainable architecture tailored for Android applications, promoting best practices and design patterns.