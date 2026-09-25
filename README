# SQL database testing — MySQL + JDBC

UI-тесты авторизации в учебном банковском приложении с получением кода подтверждения напрямую из базы данных MySQL.

**Stack:** `Java 11` · `JUnit 5` · `Selenide` · `MySQL` · `JDBC` · `Apache Commons DbUtils` · `Faker` · `Lombok` · `Docker Compose` · `Page Object`

## Что проверяется

- успешный вход существующего пользователя с кодом подтверждения из БД;
- вход несуществующего пользователя: отображается ошибка «Неверно указан логин или пароль»;
- ввод неверного кода подтверждения: отображается ошибка «Неверно указан код».

После каждого теста удаляются коды подтверждения, после всех тестов очищаются все таблицы.

## Структура

```
src/test/java/ru/netology/banklogin/
├── data/DataHelper.java     тестовые данные и генерация случайных пользователей (Faker)
├── data/SQLHelper.java      подключение к MySQL через JDBC и SQL-запросы
├── page/                    Page Object: вход, подтверждение, личный кабинет
└── test/BankLoginTest.java  тестовые сценарии
schema/schema.sql            схема базы данных
docker-compose.yml           контейнер MySQL
```

## Запуск

1. Запустить MySQL в Docker:

```
   docker-compose up -d
```

2. Запустить тестируемое приложение, указав подключение к базе данных:

```
   java -jar ./artifacts/app-deadline.jar -P:jdbc.url=jdbc:mysql://localhost:3306/db -P:jdbc.user=app -P:jdbc.password=pass
```

3. Запустить тесты:

```
   ./gradlew clean test
```

4. После работы остановить контейнер:

```
   docker-compose down
```
