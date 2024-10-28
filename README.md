# Duration Picker Library
This is a duration picker dialog for android with hour, minute and second.

## Screenshot
<img align="center" src="https://github.com/iambhargavnath/durationpicker-library/blob/master/Screenshot.png" alt="Screenshot" width="360"/>

## Installation

### Installation for Groovy DSL

1. Add the following dependency in your project's `build.gradle` file:
```
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
  }
}
```

2. Add the following dependency in your app's `build.gradle` file:
```
dependencies {
  implementation 'com.github.iambhargavnath:DurationPicker:v1.0.3'
}
```

### Installation for Kotlin DSL

1. Add the following dependency in your project's `settings.gradle.kts` file:
```kotlin
dependencyResolutionManagement {
  ...
  repositories {
    ...
    mavenCentral()
    maven(url = "https://jitpack.io")
  }
}
```

2. Add the following dependency in your app's `build.gradle.kts` file:
```kotlin
dependencies {
  implementation("com.github.iambhargavnath:DurationPicker:v1.0.3")
}
```

## How to use

```Example Code in Kotlin
val title = "Duration"
val dialog = DurationPickerDialog(this, title, object : DurationPickerDialog.OnDurationSetListener {
  override fun onDurationSet(hours: Int, minutes: Int, seconds: Int) {
    \\ Write your code here
    }
  })
dialog.show()
```

### Developed by Bhargav Nath
## Find me at
<p align="left">
<a href="https://twitter.com/iambhargavnath" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="iambhargavnath" height="30" width="40" /></a>
<a href="https://linkedin.com/in/iambhargavnath" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="iambhargavnath" height="30" width="40" /></a>
<a href="https://fb.com/iambhargavnath" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="iambhargavnath" height="30" width="40" /></a>
<a href="https://instagram.com/iambhargavnath" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="iambhargavnath" height="30" width="40" /></a>
</p>
