# Проект автоматизации тестирования для "Спортмастера"

Проект выполнен в рамках курса по автоматизации школы <a href="https://qa.guru">QA.Guru</a>.

<img src="/images/sportmaster.png">

## Содержание:

* <a href="#link-технологии-и-инструменты">Технологии и инструменты</a>
* <a href="#link-реализованные-проверки">Реализованные проверки</a>
* <a href="#link-сборка-в-jenkins">Сборка в Jenkins</a>
* <a href="#link-запуск-из-инструменты-командной-строки">Запуск из командной строки</a>
* <a href="#link-allure-отчет">Allure отчет</a>
* <a href="#link-отчет-в-telegram">Отчет в Telegram</a>
* <a href="#link-видео-прохождения-тестов">Видео прохождения тестов</a>


## :link: Технологии и инструменты
В проекте используются:

<p align="center">
<img width="6%" src="/images/icons/Java.svg">
<img width="6%" src="/images/icons/Intelij_IDEA.svg">
<img width="6%" src="/images/icons/Gradle.svg">
<img width="6%" src="/images/icons/JUnit5.svg">
<img width="6%" src="/images/icons/Selenide.svg">
<img width="6%" src="/images/icons/Selenoid.svg">
<img width="6%" src="/images/icons/GitHub.svg">
<img width="6%" src="/images/icons/Allure_Report.svg">
<img width="6%" src="/images/icons/Telegram.svg">
</p>

Тесты написаны на Java с использованием фреймворков Selenide, JUnit 5 и Allure. Для сборки проекта используется Gradle.

## Реализованные проверки
- [x] Смена города пользователя
- [x] Поиск магазина по адресу
- [x] Поиск товара по названию
- [x] Заполнение формы подарочной карты
- [x] Присоединение к клубной программе 

## Запуск из командной строки
Реализована возможность как локального, так и удалённого запуска.

Локальный запуск выполняется командой:
`gradle clean test`

Удалённый запуск выполняется командой:
`gradle clean test -DselenoidURL={selenoidURL}`, где вместо {selenoidURL} передаётся адрес Selenoid. 

В отдельный config-file вынесены настройки для запуска: адрес сайта, версия браузера, логин и пароль для удалённого запуска.

Пример файла с настройками можно посмотреть в src/test/resources/config, файл credentials-example.properties.

## Сборка в Jenkins
Для удалённого запуска можно настроить запуск в Jenkins. Пример прогона:

<img src="/images/reports/jenkins_report.png">

## Allure отчет
Результат прогона тестов можно посмотреть в отчёте. Информация в тесте представлена в виде шагов с действиями.

<img src="/images/reports/allure_main.png">
<img src="/images/reports/test_example.png">

## Отчет в Telegram
Результат прохождения тестов отправляется в Telegram с помощью бота. Пример сообщения с отчётом:

<p align="center">
<img src="/images/reports/telegram_report.png">
</p>

## Видео пример прохождения теста
Для каждого теста есть видео с прохождением. Ниже один из примеров:

<p align="center">
<img src="/images/video.gif">
</p>