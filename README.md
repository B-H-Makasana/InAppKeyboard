# InAppKeyboard

A Jetpack Compose library that provides a fully customizable **In-App Keyboard**.  
Easily place the keyboard **anywhere on the screen**, **toggle its visibility**, and choose between **numeric** and **alphanumeric** layouts — all without relying on the system keyboard.

## Features

It Provide Numeric, AlphaNumeric keyboard

Show/Hide the keyboard programmatically based on your requirement

Place the keyboard anywhere in your Compose layout.

Designed for full in-app control (great for games, forms, and kiosk apps)

Fully built with **Jetpack Compose**
## Installation

To use the InAppKeyboard in Android project, follow below steps:

### 1. Dependency

```
Add the dependency to a module:

```groovy
   api("")
```

### 2. For use different types of keyboard follow below steps

#### 2.1 For use alphanumeric and numeric keyboard follow below steps 
```kotlin, Put InAppKeyboardView in you layout where keyboard need to display

InAppKeyboardView(activity = view, modifier = Modifier)

``` 
#### 2.2 Pass keyboard type and keyboard visible in textfield:
```kotlin
    TextField(name, onValueChange = {
    name = it
}, modifier = Modifier.onFocusChanged {
    if (it.isFocused) {
        KeyboardController.keyboardVisible(true)
        KeyboardController.keyboardType(KeyboardType.AlphaNumeric) // Pass keyboard tupe Numeric is numeric keyboard needs to display
    }
 })
```

## Changelog
[Keyboard library Changelog](./CHANGELOG.md)