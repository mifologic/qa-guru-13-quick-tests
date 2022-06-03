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

![](/images/icons/Java.svg)
![](/images/icons/Intelij_IDEA.svg)
![](/images/icons/Gradle.svg)
![](/images/icons/JUnit5.svg)
![](/images/icons/Selenide.svg)
![](/images/icons/Selenoid.svg)
![](/images/icons/GitHub.svg)
![](/images/icons/Allure_Report.svg)
![](/images/icons/Telegram.svg)


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

![](/images/reports/jenkins_report.svg)

## Allure отчет

![](/images/reports/allure_main.svg)
![](/images/reports/test_example.svg)

## Отчет в Telegram

![](/images/reports/telegram_report.svg)

## Видео пример прохождения теста

