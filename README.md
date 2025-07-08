# KlistAssignment

KlistAssignment is an Android application built using Jetpack Compose that demonstrates how to display a dynamic list of items (mock cryptocurrency data) with a custom list component. It showcases the use of modern Android development practices including ViewModel, StateFlow, and a custom composable list builder (`KList`).

## Features

*   **Dynamic List Display**: Fetches and displays a list of mock cryptocurrency names.
*   **Custom List Component (`KList`)**: A reusable Jetpack Compose component for building lists with:
    *   Optional header.
    *   Customizable item padding.
    *   Custom item content rendering.
*   **ViewModel Integration**: Uses `CoinViewModel` to manage and expose the list data (`StateFlow`) to the UI.
*   **Clickable List Items**: Each item in the list (`KListItem`) can be clicked, triggering a Toast message with the item's name.
*   **Modern Android Stack**:
    *   100% Kotlin
    *   Jetpack Compose for UI
    *   ViewModel for state management
    *   Coroutines and StateFlow for asynchronous operations and reactive data streams.

## Project Structure

The project follows a standard Android structure with a focus on separating concerns:

*   **`MainActivity.kt`**: The main entry point of the application. Sets up the theme and hosts the `HomeScreen`.
*   **`demo/HomeScreen.kt`**: The main screen composable that observes data from `CoinViewModel` and uses `KList` to display the coin data.
*   **`data/KList.kt`**: A custom, reusable Jetpack Compose component designed to build lists declaratively. It allows for setting a header, padding, and defining custom rendering for list items.
*   **`ui/presentation/KListItem.kt`**: (Assumed based on usage) A composable function that defines the UI for a single item in the list. It likely takes the item data and an `onClick` lambda.
*   **`ui/viewmodel/CoinViewModel.kt`**: (Assumed based on usage) A `ViewModel` responsible for fetching/providing the list of coin names and exposing it to the UI via a `StateFlow`.
*   **`ui/theme/`**: Contains theme-related files for Jetpack Compose (Colors, Typography, Theme).

## How It Works

1.  **Data Fetching**: `CoinViewModel` (presumably) initializes and provides a list of coin names through a `StateFlow<List<String>>`.
2.  **UI Observation**: `HomeScreen` collects the `StateFlow` from `CoinViewModel`. When the data changes, the UI recomposes.
3.  **List Construction**: `HomeScreen` uses the `KList` builder to configure the list:
    *   Sets padding using `.padding()`.
    *   Sets a title using `.header()`.
    *   Provides the list of coins and a lambda to `items()` that defines how each `KListItem` should be rendered.
4.  **Item Rendering**: The lambda passed to `KList.items()` calls `KListItem` for each coin. `KListItem` displays the coin name and handles click events.
5.  **Display**: Finally, `myList.Render()` is called in `HomeScreen` to compose and display the `LazyColumn` defined within `KList`.
6.  **Interaction**: Clicking on a `KListItem` triggers its `onClick` lambda, which displays a `Toast` message.

## Building and Running

1.  Clone the repository:
2.  Open the project in Android Studio (latest stable version recommended).
3.  Let Android Studio sync Gradle dependencies.
4.  Run the app on an Android emulator or a physical device.

## Key Components

### `KList<T>`

A custom DSL-like builder for creating lists in Jetpack Compose.

**Usage:**

****** Dependencies ******

•AndroidX Core KTX
•Jetpack Compose (UI, Material3, Graphics, Tooling Preview)
•Lifecycle (ViewModel Compose, Runtime KTX)
•Activity Compose











