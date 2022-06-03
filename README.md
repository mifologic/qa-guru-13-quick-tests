# Проект автоматизации тестирования для "Спортмастера"

## Содержание:

* Технологии и инструменты
* Реализованные проверки
* Сборка в Jenkins
* Запуск из терминала
* Allure отчет
* Отчет в Telegram
* Видео примеры прохождения тестов


## Технологии и инструменты

![](/src/resources/images/icons/Java.svg)
<img width="6%" title="Java" src="img/icons/Java.svg">
<img width="6%" title="Intelij_IDEA" src="img/icons/Intelij_IDEA.svg">
<img width="6%" title="Gradle" src="img/icons/Gradle.svg">
<img width="6%" title="JUnit5" src="img/icons/JUnit5.svg">
<img width="6%" title="Selenide" src="img/icons/Selenide.svg">
<img width="6%" title="Selenoid" src="img/icons/Selenoid.svg">
<img width="6%" title="GitHub" src="img/icons/GitHub.svg">
<img width="6%" title="Allure_Report" src="img/icons/Allure_Report.svg">
<img width="6%" title="Telegram" src="img/icons/Telegram.svg">

## Реализованные проверки
- [x] Смена города пользователя
- [x] Поиск магазина по адресу
- [x] Поиск товара по названию
- [x] Заполнение формы подарочной карты
- [x] Присоединение к клубной программе 

## Запуск из командной строки
gradle clean test -DselenoidURL={selenoidURL}

Вместо {selenoidURL} передаётся адрес Selenoid для удалённого запуска тестов.

## Сборка в Jenkins

<img width="6%" title="" src="img/reports/jenkins_report.svg">

## Allure отчет

<img width="6%" title="" src="img/reports/allure_main.svg">
<img width="6%" title="" src="img/reports/test_example.svg">

## Отчет в Telegram

<img width="6%" title="" src="img/reports/telegram_report.svg">

## Видео пример прохождения теста

