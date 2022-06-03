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

![](/images/reports/jenkins_report.png)

## Allure отчет

![](/images/reports/allure_main.png)
![](/images/reports/test_example.png)

## Отчет в Telegram
<p align="center">
![](/images/reports/telegram_report.png)
</p>
## Видео пример прохождения теста
<p align="center">
![](/images/video.gif)
</p>