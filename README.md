# Android Clean Architecture Sample App

A complete production-ready Android application demonstrating **Clean Architecture** principles with modern Android development best practices.

## 🏗️ Architecture

This project follows **Clean Architecture** with clear separation of concerns across three main layers:

### Layers
- **Presentation Layer**: UI components (Activities, Fragments, ViewModels)
- **Domain Layer**: Business logic (Use Cases, Models, Repository Interfaces)
- **Data Layer**: Data sources (API, Database, Repositories)

### Core Components
- **Base Classes**: Reusable foundation classes for Activity, Fragment, ViewModel, Repository, UseCase
- **Result Wrapper**: Type-safe result handling with Success, Error, and Loading states
- **Exception Handling**: Custom exception types with centralized error handling
- **Dependency Injection**: Hilt for compile-time verified dependency injection

## 🚀 Features

✅ **Clean Architecture** with SOLID principles
✅ **MVVM Pattern** with ViewModels and LiveData
✅ **Dependency Injection** with Hilt
✅ **Network Layer** with Retrofit & OkHttp
✅ **Local Database** with Room
✅ **Coroutines** for asynchronous operations
✅ **Navigation Component** for screen navigation
✅ **ViewBinding** for type-safe view access
✅ **Material Design 3** UI components
✅ **Google Maps** integration ready
✅ **Payment Gateway** (Stripe) integration ready
✅ **Media Playback** with ExoPlayer
✅ **Image Loading** with Coil
✅ **Logging** with Timber
✅ **Security** with encrypted preferences
✅ **Unit & UI Testing** ready

## 📦 Tech Stack

### Core
- **Kotlin** - Primary language
- **Coroutines** - Asynchronous programming
- **Flow** - Reactive streams
- **ViewBinding** - Type-safe view access

### Architecture & DI
- **Hilt** - Dependency injection
- **ViewModel** - UI state management
- **LiveData** - Observable data holder
- **Navigation Component** - Screen navigation

### Network
- **Retrofit** - REST API client
- **OkHttp** - HTTP client
- **Gson** - JSON serialization

### Database
- **Room** - Local database
- **Encrypted SharedPreferences** - Secure key-value storage

### UI
- **Material Design 3** - Modern UI components
- **ConstraintLayout** - Flexible layouts
- **RecyclerView** - Efficient lists

### Media & Images
- **ExoPlayer** - Video/audio playback
- **Coil** - Image loading & caching

### Testing
- **JUnit** - Unit testing
- **Espresso** - UI testing
- **Mockito** - Mocking framework

### Other
- **Timber** - Logging
- **Google Maps** - Maps integration
- **Stripe** - Payment processing

## 📁 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/ravidhakar/cleanarchsample/
│   │   │   ├── app/
│   │   │   │   └── MyApplication.kt
│   │   │   ├── core/
│   │   │   │   ├── base/
│   │   │   │   │   ├── BaseActivity.kt
│   │   │   │   │   ├── BaseFragment.kt
│   │   │   │   │   ├── BaseViewModel.kt
│   │   │   │   │   └── BaseRepository.kt
│   │   │   │   ├── di/
│   │   │   │   │   ├── AppModule.kt
│   │   │   │   │   └── NetworkModule.kt
│   │   │   │   ├── result/
│   │   │   │   │   └── Result.kt
│   │   │   │   └── exception/
│   │   │   │       └── AppException.kt
│   │   │   ├── data/
│   │   │   │   ├── local/
│   │   │   │   ├── remote/
│   │   │   │   └── repository/
│   │   │   ├── domain/
│   │   │   │   ├── models/
│   │   │   │   ├── repository/
│   │   │   │   └── usecases/
│   │   │   └── presentation/
│   │   │       └── ui/
│   │   │           └── main/
│   │   │               └── MainActivity.kt
│   │   ├── res/
│   │   └── AndroidManifest.xml
│   └── test/
└── build.gradle.kts
```

## 🛠️ Setup

### Prerequisites
- Android Studio Hedgehog | 2023.1.1 or newer
- JDK 17 or newer
- Android SDK 31 or newer
- Gradle 8.0 or newer

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/ravidhakar/android-clean-architecture-sample.git
   cd android-clean-architecture-sample
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned directory

3. **Build the project**
   ```bash
   ./gradlew build
   ```

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click "Run" in Android Studio or execute:
   ```bash
   ./gradlew installDebug
   ```

## 📝 Configuration

### API Configuration
Update the base URL in `NetworkModule.kt`:
```kotlin
private const val BASE_URL = "https://your-api-url.com/"
```

### Maps API Key
Add your Google Maps API key to `local.properties`:
```properties
MAPS_API_KEY=your_google_maps_api_key_here
```

## 🧪 Testing

### Run Unit Tests
```bash
./gradlew test
```

### Run UI Tests
```bash
./gradlew connectedAndroidTest
```

## 📚 Key Concepts

### Clean Architecture Benefits
1. **Independence**: Each layer is independent and can be developed/tested separately
2. **Testability**: Business logic is separate from framework and can be unit tested
3. **Maintainability**: Clear structure makes code easier to understand and modify
4. **Scalability**: Easy to add new features without affecting existing code
5. **Flexibility**: Easy to swap implementations (e.g., change database or API)

### SOLID Principles Applied
- **S**ingle Responsibility: Each class has one reason to change
- **O**pen/Closed: Open for extension, closed for modification
- **L**iskov Substitution: Subtypes are substitutable for their base types
- **I**nterface Segregation: Many specific interfaces over one general interface
- **D**ependency Inversion: Depend on abstractions, not concretions

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Ravi Dhakar**
- GitHub: [@ravidhakar](https://github.com/ravidhakar)

## 🙏 Acknowledgments

- Clean Architecture by Robert C. Martin
- Android Architecture Components
- Google's Guide to App Architecture

---

**⭐ If you find this project helpful, please give it a star!**