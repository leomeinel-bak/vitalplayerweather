<!-- PROJECT SHIELDS -->

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![Quality][quality-shield]][quality-url]

<!-- PROJECT LOGO -->
<!--suppress ALL -->
<br />
<p align="center">
  <a href="https://github.com/LeoMeinel/vitalplayerweather">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">VitalPlayerWeather</h3>

  <p align="center">
    Change playerweather on Spigot and Paper
    <br />
    <a href="https://github.com/LeoMeinel/vitalplayerweather"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/LeoMeinel/vitalplayerweather">View Demo</a>
    ·
    <a href="https://github.com/LeoMeinel/vitalplayerweather/issues">Report Bug</a>
    ·
    <a href="https://github.com/LeoMeinel/vitalplayerweather/issues">Request Feature</a>
  </p>

<!-- ABOUT THE PROJECT -->

## About The Project

### Description

VitalPlayerWeather is a Plugin that gives players the ability to change their weather.

This plugin is perfect for any server wanting their players to see the server with their preferred weathertype.

### Features

- Change playerweather
- Reset playerweather

### Built With

- [Gradle 7](https://docs.gradle.org/7.5.1/release-notes.html)
- [OpenJDK 17](https://openjdk.java.net/projects/jdk/17/)

<!-- GETTING STARTED -->

## Getting Started

To get the plugin running on your server follow these simple steps.

### Commands and Permissions

1. Permission: `vitalplayerweather.set`

- Command: `/pweather`
- Description: Reset your playerweather
- Command: `/pweather <weather>`
- Description: Change your playerweather

### Configuration - messages.yml

```yaml
reset-weather: "Your weather has been reset"
set-weather: "&fYour weather has been changed to &b%weather%"
no-perms: "&cYou don't have enough permissions!"
player-only: "&cThis command can only be executed by players!"
invalid-weather: "&cInvalid weather!"
```

<!-- ROADMAP -->

## Roadmap

See the [open issues](https://github.com/LeoMeinel/vitalplayerweather/issues) for a list of proposed features (and
known issues).

<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to be, learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->

## License

Distributed under the GNU General Public License v3.0. See `LICENSE` for more information.

<!-- CONTACT -->

## Contact

Leopold Meinel - [leo@meinel.dev](mailto:leo@meinel.dev) - eMail

Project Link - [VitalPlayerWeather](https://github.com/LeoMeinel/vitalplayerweather) - GitHub

<!-- ACKNOWLEDGEMENTS -->

### Acknowledgements

- [README.md - othneildrew](https://github.com/othneildrew/Best-README-Template)

<!-- MARKDOWN LINKS & IMAGES -->

[contributors-shield]: https://img.shields.io/github/contributors-anon/LeoMeinel/vitalplayerweather?style=for-the-badge
[contributors-url]: https://github.com/LeoMeinel/vitalplayerweather/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/LeoMeinel/vitalplayerweather?label=Forks&style=for-the-badge
[forks-url]: https://github.com/LeoMeinel/vitalplayerweather/network/members
[stars-shield]: https://img.shields.io/github/stars/LeoMeinel/vitalplayerweather?style=for-the-badge
[stars-url]: https://github.com/LeoMeinel/vitalplayerweather/stargazers
[issues-shield]: https://img.shields.io/github/issues/LeoMeinel/vitalplayerweather?style=for-the-badge
[issues-url]: https://github.com/LeoMeinel/vitalplayerweather/issues
[license-shield]: https://img.shields.io/github/license/LeoMeinel/vitalplayerweather?style=for-the-badge
[license-url]: https://github.com/LeoMeinel/vitalplayerweather/blob/main/LICENSE
[quality-shield]: https://img.shields.io/codefactor/grade/github/LeoMeinel/vitalplayerweather?style=for-the-badge
[quality-url]: https://www.codefactor.io/repository/github/LeoMeinel/vitalplayerweather
