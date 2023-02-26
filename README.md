# Guinguin News - Tinder-like News App
Guinguin News is an Android news app that provides a Tinder-like user interface for browsing news articles. The app is based on the Google Component Architectural MVVM pattern, which allows for decoupling of the code and easier maintenance.

## Features
- Bottom bar and page navigation implemented using Jetpack's Navigation component, allowing for deep linking and improved user navigation experience.
- CardStackView (RecyclerView) 3rd party library integrated to provide swipe gestures for liking/disliking news articles, and animations for adding, updating, and removing items, improving the performance when loading list items.
- ROOM Database with LiveData & ViewModel used to support local cache and offline mode, minimizing repetitive and error-prone boilerplate code and streamlining database migration paths.

## Requirements
- Android Studio 4.1 or higher
- Android SDK 21 or higher

## Installation
- Clone the repository to your local machine.
- Open the project in Android Studio.
- Run the app on an emulator or physical device.

## Usage
- Swipe left or right to like or dislike a news article.
- Click on an article to read the full story.
- Use the bottom navigation bar to switch between different categories.

## Acknowledgements
- Jetpack Navigation Component: https://developer.android.com/guide/navigation/navigation-getting-started
- CardStackView: https://github.com/yuyakaido/CardStackView
- ROOM Persistence Library: https://developer.android.com/topic/libraries/architecture/room
- LiveData: https://developer.android.com/topic/libraries/architecture/livedata
- ViewModel: https://developer.android.com/topic/libraries/architecture/viewmodel
