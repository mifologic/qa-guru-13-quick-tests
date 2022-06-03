# Проект автоматизации тестирования для "Спортмастера"

## Содержание:

* <a href=":link:-технологии-и-инструменты">Технологии и инструменты</a>
* Реализованные проверки
* Сборка в Jenkins
* Запуск из терминала
* Allure отчет
* Отчет в Telegram
* Видео примеры прохождения тестов


## :link: Технологии и инструменты
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

## Реализованные проверки
- [x] Смена города пользователя
- [x] Поиск магазина по адресу
- [x] Поиск товара по названию
- [x] Заполнение формы подарочной карты
- [x] Присоединение к клубной программе 

## Запуск из командной строки
`gradle clean test -DselenoidURL={selenoidURL}`

Вместо {selenoidURL} передаётся адрес Selenoid для удалённого запуска тестов.

## Сборка в Jenkins

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