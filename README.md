# Keyboard Library

The Keyboard Library provide custom keyboard to Android app.

## Features

### Provide Different Types of keyboard
It Provide Numeric, AlphaNumeric & Chat Keyboard  

### Show and hide keyboard from app: 
It provide show and hide keyboard features

## Installation

To use the Keyboard library in Android project, follow below steps:

### 1. Dependency

Add the repository to your gradle dependencies:

```groovy
maven {
    credentials {
        // Read properties from gradle.properties
        val jfrogKey: String by settings
        val jfrogUser: String by settings
        username = jfrogUser
        password = jfrogKey
    }
    url = uri("https://jfrog.quipment.nl/artifactory/QRISTAL-LIBS/")
}
```
Add the dependency to a module:

```groovy
   api("quipment.qristal:keyboardLibrary:3.0.0")
```

### 2. For use different types of keyboard follow below steps

#### 1.1 For use alphanumeric and numeric keyboard follow below steps 
```kotlin

import java.lang.reflect.Modifier

/**
 * KeyboardView : This method will be called from app in which keyboard library will integrate
 * @param activity : pass current activity
 * @param modifier : modifier for keyboard view
 */
KeyboardView(activity = view.value, modifier = Modifier)

``` 
#### 1.2 Pass keyboard type and keyboard visible in textfield:
```kotlin
TextField(value = number.value,
    onValueChange = {
        number.value = it },
    modifier = Modifier.onFocusChanged {
        if (it.isFocused) {
            KeyboardOption.apply {
                keyboardType(KeyboardType.Numeric)
                keyboardVisible(true)
            }
        }
    })
```

#### 2.1 For use ChatKeyboard in app follow below step
```kotlin
/**
 * @param activity : pass current activity
 * @param modifier : modifier for keyboard view
 * @param textFieldValue : pass textfiled 
 */
var mActivity = LocalContext.Current
var textField = mutableStateOf(TextFieldValues())
ChatKeyboard(activity = mActivity,
    modifier = Modifier,
    textFieldValue = textField
)
```

## Changelog
[Keyboard library Changelog](./CHANGELOG.md)