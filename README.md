[![Maintainability](https://api.codeclimate.com/v1/badges/2155307b6924881d976d/maintainability)](https://codeclimate.com/github/simiyu1/JavaDevsNairobi/maintainability) [![Test Coverage](https://api.codeclimate.com/v1/badges/2155307b6924881d976d/test_coverage)](https://codeclimate.com/github/simiyu1/JavaDevsNairobi/test_coverage) [![CircleCI](https://circleci.com/gh/simiyu1/JavaDevsNairobi/tree/develop.svg?style=svg)](https://circleci.com/gh/simiyu1/JavaDevsNairobi/tree/develop) [![codecov](https://codecov.io/gh/simiyu1/JavaDevsNairobi/branch/master/graph/badge.svg)](https://codecov.io/gh/simiyu1/JavaDevsNairobi)

# Java Developers Nairobi

Discover the techies making a ripple on the Nairobi Tech-scene in Java. This app will
also allow you to share their profiles with others and browse through the entire list. It consumes
 the GitHub Search API.

# Mock ups

## Entry screen             |  Details screen
![Entry screen](https://github.com/simiyu1/JavaDevsNairobi/blob/ch-link-wireframes-to-readme-158791077/wireframes/userlistsmall.png)  ![Entry screen](https://github.com/simiyu1/JavaDevsNairobi/blob/ch-link-wireframes-to-readme-158791077/wireframes/userprofilesmall.png)


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for
development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
An IDE (Android Studio preferred)
Stable internet (to download the dependencies)
An emulator/ Android phone(debug mode)
Git (not required but preferred)
```

### Installing

Follow these steps to get a copy of this project on your machine

#### Step one
 - Install the latest version of Android Studio from
 [ Official Android Developers](https://developer.android.com/studio/)
 - Instructions when you get stuck downloading it are at
  [ Install Android Studio ](https://developer.android.com/studio/install#mac)

#### Step two
 - Download the latest SDK from [Developers ](https://developer.android.com/studio/#downloads)
 or use the SDK manager within Android Studio

 - Install Git through homebrew (if it doesn't exist)
    -   Install Homebrew paste the following on terminal
        ```
        ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
        brew doctor
        ```
    -   Install Git
        ```
        brew install git
        ```

 - Clone the repo into your desired folder
    -  In terminal, move into the desired directory
    -  Pasted the following in terminal to clone this repo
        ```
        git clone https://github.com/simiyu1/JavaDevsNairobi.git
        ```

 - Open Android studio and open the folder cloned into your machine.
    - File -> new -> import project

 - Ensure you have stable internet, let gradle run and install the dependencies the project requires.


## Running the tests

Running the automated tests for this system

### Local Unit tests

Run the unit tests in terminal using the command

```
./gradlew test
```

### Instrumentation tests

Run the Instrumentation tests in terminal using the command

```
./gradlew connectedAndroidTest
```

### Check for coding style errors using Lint

```
./gradlew lint test
```

## Deployment

 - Edit the fastlane and .Evn variables in .zshrc file with slack token to deploy to slack.
  Use the command
    ```
    fastlane slackbuild
    ```

## Built With

* [Retrofit](https://square.github.io/retrofit/) - To make Http Requests
* [Maven](https://maven.apache.org/) - Dependency Management
* [PICASSO](http://square.github.io/picasso/) - Picture downloading and caching

## Contributing

Not accepting contributions, but feel free to fork and play with it :)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
