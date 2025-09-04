package ru.netology.banklogin.data;

import com.github.javafaker.Faker;
import lombok.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import java.util.Locale;

public class DataHelper {
    private static final Faker FAKER = new Faker(new Locale("en"));

    private DataHelper() {
    }

    public static AuthInfo getAuthInfoWithTestData() {
        return new AuthInfo("vasya", "qwerty123");
    }

    private static String generateRandomLogin() {
        return  FAKER.name().username();
    }

    private static String generatePassword() {
        return FAKER.internet().password();
    }

    public static  AuthInfo generalRandomUser() {
        return new AuthInfo(generateRandomLogin(), generatePassword());
    }

    public static VerificationCode generateRandomVerificationCode() {
        return new VerificationCode(FAKER.numerify("######"));
    }

    @Value
    public static class AuthInfo {
        String login;
        String password;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VerificationCode {
        String code;
    }
}
